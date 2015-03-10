package de.uni_muenster.sopra2015.gruppe8.octobus.view.displays;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.display.ControllerDisplaySearchConnection;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Steen Sziegaud.
 */
public class DisplaySearchConnection extends JPanel
{
    //Konstants
	final private int WIDTH = 1000;
    final private Dimension textFieldSize = new Dimension(WIDTH/2 - 10, 23);
    final private Dimension maxGridDimensions = new Dimension(WIDTH/2 - 10, 270);
    final private int halfDefaultWidth = WIDTH/2;

    //Controller
    ControllerDisplaySearchConnection controllerDisplaySearchConnection;

    //ParentJPanels for left and right side.
    private JPanel rightParentGridPanel;

    //Components
	private JButton btnBack;
    private JButton btnSearch;
    private JButton btnEarlier;
    private JButton btnFirst;
    private JButton btnLater;
    private JButton btnLast;
    private JTextField tfOrigin;
    private JTextField tfDestination;
    private JComboBox<String> cbDateSelection;
    private JComboBox<Integer> cbHourSelection;
    private JComboBox<Integer> cbMinuteSelection;
    private JTable tableSearchResults;
    private JScrollPane scrollPaneTable;
    private JPanel panelSelectedConnection;

	private JPanel display;

    //Variables
    //Gets filled with possible lines that are heading from start to destination
    private ArrayList<Object> fastLinesFromOriginToDestination;
    //private Calendar cal;

    //private JButton

    //TODO: Add functionality to buttons.
    public DisplaySearchConnection()
    {
        controllerDisplaySearchConnection = new ControllerDisplaySearchConnection(this);
		JPanel display = new JPanel();

        initComponents();

		display.setLayout(new GridLayout(0, 2));
        display.add(createLeftGridPanel());
        rightParentGridPanel = createTransparentRightGridPanel();
        display.add(rightParentGridPanel);

		add(display, BorderLayout.CENTER);

		btnBack = new JButton("Zurück");
		btnBack.addActionListener(e->{
			controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_BACK);
		});

		JPanel plButton = new JPanel();
		plButton.setLayout(new BorderLayout());
		plButton.add(btnBack, BorderLayout.EAST);
		add(plButton, BorderLayout.PAGE_END);
    }


    public void initComponents()
    {
        //Panel to contain components for the right hand side.
        rightParentGridPanel = new JPanel();

        //Button to make a searchrequest
        btnSearch = new JButton("Suchen");
        btnSearch.addActionListener(e ->
				controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_SEARCH));

        //Button to show (add) earlier results in the journeytable
        btnEarlier = new JButton("Früher");
        btnEarlier.addActionListener(e ->
				controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_EARLIER));

        //Button to show (add) the earliest journey in the journeytable.
        btnFirst = new JButton("Erster Fahrt");
        btnFirst.addActionListener(e ->
				controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_FIRST));

        //Analog to earlier
        btnLater = new JButton("Später");
        btnLater.addActionListener(e ->
				controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_LATER));

        //Analog to first
        btnLast = new JButton("Letzte Fahrt");
        btnLast.addActionListener(e ->
				controllerDisplaySearchConnection.buttonPressed(EmitterButton.DISPLAY_CONNECTION_LAST));

        //Comboboxes to choose date and time.
        //TODO: Add listeners and functionality
        //TODO: Implement cbDateSelection?

        //cbDateSelection = new JComboBox<>();
        cbHourSelection = new JComboBox<>();
        cbMinuteSelection = new JComboBox<>();


        //JPanel to display details about the selected
        panelSelectedConnection = new JPanel();


        tfOrigin = new JTextField(20);
        tfOrigin.setToolTipText("Starthaltestelle eingeben");
        tfDestination = new JTextField(20);
        tfDestination.setToolTipText("Zielhaltestelle eingeben");


        createTable();
    }


    private void createTable()
    {
        String[] columnNames = {"Fahrt", "Abfahrt", "Ankunft", "Dauer", "Umsteigen"};
        String[][] data = {{"1. Fahrt", "17:05", "17:25", "00:20", "0x"},
                {"2. Fahrt", "17:08", "17:30", "00:22", "0x"}};
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };


        // Limits user to only select one row at time
        class ForcedListSelectionModel extends DefaultListSelectionModel
        {
            public ForcedListSelectionModel () {
                setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

            @Override
            public void clearSelection() {
            }

            @Override
            public void removeSelectionInterval(int index0, int index1) {
            }
        }

        tableSearchResults = new JTable(tableModel);
        tableSearchResults.setSelectionModel(new ForcedListSelectionModel());
        tableSearchResults.getSelectionModel().addListSelectionListener(e ->
                controllerDisplaySearchConnection.tableSelectionChanged(EmitterTable.FORM_JOURNEY_SEARCH_RESULT));
        tableSearchResults.setPreferredSize(new Dimension(512, 400));
        scrollPaneTable = new JScrollPane(tableSearchResults);
        scrollPaneTable.setPreferredSize(new Dimension(halfDefaultWidth - 10, 494));
        scrollPaneTable.setMaximumSize(new Dimension(halfDefaultWidth - 10, 494));
    }


    /**
     * Creates the left side of the panel. With both searchfields and a dateselection.
     * @return the left side panel
     */
    private JPanel createLeftGridPanel()
    {
        JPanel leftGridPanel = new JPanel();


        leftGridPanel.setLayout(new GridBagLayout());
        leftGridPanel.setPreferredSize(maxGridDimensions);
        GridBagConstraints c = new GridBagConstraints();


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        leftGridPanel.add(new Label("Von:"), c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        tfOrigin.setPreferredSize(textFieldSize);
        leftGridPanel.add(tfOrigin, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        leftGridPanel.add(new Label("Nach:"), c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        tfDestination.setPreferredSize(textFieldSize);
        leftGridPanel.add(tfDestination, c);


        //DateSelectionPanel - Date: DAY.MONTH.YEAR HOURS:MINUTES
        JPanel dateSelectionPanel = new JPanel();

        dateSelectionPanel.setLayout(new BoxLayout(dateSelectionPanel, BoxLayout.X_AXIS));
        dateSelectionPanel.setPreferredSize(new Dimension(halfDefaultWidth - 100, 23));


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        leftGridPanel.add(new JLabel("Datum:"), c);

        //String[] dummyCal = {"1.Januar.2015", "2.Januar.2013"};
        //cbDateSelection = new JComboBox<>(dummyCal);



        Integer[] hours = new Integer[24];
        for (int i = 0; i < hours.length; i++)
            hours[i] = i;
        Integer[] minutes = new Integer[61];
        for (int i = 0; i < minutes.length; i++)
            minutes[i] = i;

        cbHourSelection = new JComboBox<>(hours);
        cbHourSelection.setSelectedIndex(Calendar.HOUR_OF_DAY);
        cbMinuteSelection = new JComboBox<>(minutes);
        cbMinuteSelection.setSelectedIndex(Calendar.MINUTE);


        //dateSelectionPanel.add(cbDateSelection);
        dateSelectionPanel.add(cbHourSelection);
        dateSelectionPanel.add(cbMinuteSelection);

        //Add the dateSlectionPanel created above to the leftGridPanel.
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        leftGridPanel.add(dateSelectionPanel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        leftGridPanel.add(btnSearch, c);



        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        c.gridheight = 2;
        panelSelectedConnection.setPreferredSize(new Dimension(halfDefaultWidth - 110, 320));
        panelSelectedConnection.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftGridPanel.add(panelSelectedConnection, c);


        return leftGridPanel;
    }

    /**
     * Creates the right side panel. With a few buttons to look for earlier and later journeys and the table
     * containing each found table.
     * @return the right side panel.
     */
    private JPanel createTransparentRightGridPanel()
    {
        rightParentGridPanel = new JPanel();

        //The transparent border.
        JPanel rightTransparent = new JPanel();
        rightTransparent.setPreferredSize(new Dimension(halfDefaultWidth - 10, 542));
        rightTransparent.setBorder(BorderFactory.createEmptyBorder());
        rightParentGridPanel.add(rightTransparent);


        rightParentGridPanel.setVisible(true);

        return rightParentGridPanel;
    }


    /**
     *
     */
    public void modifyRightGridPanel()
    {
        rightParentGridPanel.removeAll();
        rightParentGridPanel.setLayout(new BoxLayout(rightParentGridPanel, BoxLayout.Y_AXIS));


        //Earlier and later Buttons to look for earlier/later Journeys
        JPanel earlierButtonsPanel = new JPanel();
        earlierButtonsPanel.setLayout(new BoxLayout(earlierButtonsPanel, BoxLayout.X_AXIS));
        earlierButtonsPanel.add(btnEarlier);
        earlierButtonsPanel.add(btnFirst);


        JPanel laterButtonsPanel = new JPanel();
        laterButtonsPanel.setLayout(new BoxLayout(laterButtonsPanel, BoxLayout.X_AXIS));
        laterButtonsPanel.add(btnLater);
        laterButtonsPanel.add(btnLast);


        JPanel rightTransparent = new JPanel();
        rightTransparent.setPreferredSize(new Dimension(halfDefaultWidth - 10, 542));
        rightTransparent.setBorder(BorderFactory.createEmptyBorder());
        rightParentGridPanel.add(earlierButtonsPanel);
        rightParentGridPanel.add(scrollPaneTable);
        rightParentGridPanel.add(laterButtonsPanel);
        rightParentGridPanel.revalidate();
        rightParentGridPanel.repaint();
        rightParentGridPanel.setVisible(true);

        //Add components to new rightParent

        rightParentGridPanel.revalidate();
        rightParentGridPanel.repaint();
    }

    public void displayInformationInBox(String[] journey)
    {
        JTextPane textPane = new JTextPane();
        panelSelectedConnection.removeAll();

    }

    public JPanel getRightParentGridPanel()
    {
        return rightParentGridPanel;
    }

    public JTable getTableSearchResults()
    {
        return tableSearchResults;
    }

    public String getOrigin()
    {
        return tfOrigin.getText();
    }

    public String getDestination()
    {
        return tfDestination.getText();
    }


}
