package p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainSystem {

	/* default values have been set */
	private SystemStatus status = SystemStatus.Initialised;
	private ArrayList<Route> routes = new ArrayList<Route>();
	private ArrayList<Train> trains = new ArrayList<Train>();
	private ArrayList<Station> stations = new ArrayList<Station>();
	private ArrayList<Segment> segments = new ArrayList<Segment>();

	public TrainSystem() {
	}

	public void addStation(String sname) {
		Station stat1 = new Station(sname);
		stations.add(stat1);//Added to Program
	}

	public void removeStation(String sname) {
		for (Station i: stations){//Added to Program
			if (i.getName() == sname){
				stations.remove(i);
			} 
		}	
	}

	public void openStation(String sname) {
		for (Station i: stations){//Added to Program
			if (i.getName() == sname){
				i.open();
			}
		}
	}


	public void closeStation(String sname) {
		for (Station i: Stations){//Added to Program
			if (i.getName() == sname){
				i.close();				
			}
		}
	}

	public void addSegment(String sname, String start, String sEnd) {
		//segments.add();//Added to Progam
		//routes.add();
		//routes.add();
		Segment seg1 = new Segment(sname, start, sEnd);
		segments.add(sname);
		routes.add(start);
		routes.add(sEnd);

	}

	public void removeSegment(String sname) {
		for (Segment i: segments){//Added to Program
			if (i.getName() == sname){
				//int index = segments.index(sname);
				segments.remove(i);
				
				//routes.remove(index * 2);
				//routes.remove((index * 2) + 1);
			}
		}
	}

	public void openSegment(String sname) {
		for (Segment i : segments){//Added to Program
			if (i.getName() == sname){
				i.open();
			}
		}
	}

	public void closeSegment(String sname) {
		for (Segment i : segments){//Added to Program
			if (i.getName() == sname){
				i.close();
			}
		}
	}

	public void addRoute(String rname, boolean isRoundTrip, ArrayList<String> segs) {
		Route rName = new Route(rname, isRoundTrip);
		routes.add(rname);
		rName.addSegments(segs);
		}

	public void removeRoute(String rname) {
		for (Route i: routes){
			if (i.getName() == rname){
				routes.remove(i);
			}
		}

	}

	public void openSRoute(String rname) {
		for (Route i: routes){
			if (i.getName() == rname){
				i.close();
			}
		}
	}

	public void closeRoute(String rname) {
		for (String i: Route){
			if (i == rname){
				i.close();
			}
		}
	}

	public int addTrain() {
		Train t1 = new Train();
		return -1;
	}

	public void removeTrain(int id) {
		for (String i: trains){
			if (i.getId() == id){
				trains.remove(i);
			}
		}
	}

	public void registerTrain(int train, String route) {
		
	}

	public void deRegisterTrain(int train) {
	}

	public boolean containsStation(String station) {
		if (station.hasTrain() == true){//added to program
			return true;
		}else{
			return false;
		}
	}

	public boolean containsSegment(String segment) {
		for (Segment seg: segments){
			if (seg.hasTrain() == true)
			return true;
	}
		return false;
	}
	public boolean containsRoute(String route) {
		for (Route rout: routes){
			if (rout.hasTrain() == true)
			return true;
		}
		return false;
	}

	public boolean containsTrain(int train) {
		for (Route trn : trains) {
			if (trn.)
			
		}
		return false;
	}

	public String getStationInfo(String station) {
		return "";
	}

	public String getSegmentInfo(String segment) {
		return "";
	}

	public String getRouteInfo(String route) {
		return "";
	}

	public String getTrainInfo(int train) {
		return "";
	}

	public void openAll() {
		for(Route r: routes){
			r.open();
		}
		for (Segment s: segments){
			s.open();
		}
		for (Station st: stations){
			st.open();
		}
	}

	public void closeAll(String name) {
	}

	public void setToWorking() {
	}

	public void setPaused() {
	}

	public void setStopped() {
	}

	public SystemStatus currentStatus() {
		return status;
	}

	public boolean verify() {
		return false;
	}

	public void advance() {
	}

	@Override
	public String toString() {
		String sts = "[";
		if (stations == null || stations.size() == 0)
			sts += "none]";
		else { // extract helper method for this
			Station[] acc1 = stations.toArray(new Station[0]);
			Arrays.sort(acc1);
			List<Station> ss = Arrays.asList(acc1);
			for (Station s : ss)
				sts += (ss.indexOf(s) == 0 ? "\n\t" : "\t") + s + (ss.indexOf(s) != ss.size() - 1 ? "\n" : "\n\t]");
		}

		String sgs = "[";
		if (segments == null || segments.size() == 0)
			sgs += "none]";
		else {
			Segment[] acc1 = segments.toArray(new Segment[0]);
			Arrays.sort(acc1);
			List<Segment> ss = Arrays.asList(acc1);
			for (Segment s : ss)
				sgs += (ss.indexOf(s) == 0 ? "\n\t" : "\t") + s + (ss.indexOf(s) != ss.size() - 1 ? "\n" : "\n\t]");
		}

		String rts = "[";
		if (routes == null || routes.size() == 0)
			rts += "none]";
		else {
			Route[] acc1 = routes.toArray(new Route[0]);
			Arrays.sort(acc1);
			List<Route> ss = Arrays.asList(acc1);
			for (Route s : ss)
				rts += (ss.indexOf(s) == 0 ? "\n\t" : "\t") + s + (ss.indexOf(s) != ss.size() - 1 ? "\n" : "\n\t]");
		}

		String tns = "[";

		if (trains == null || trains.size() == 0)
			tns += "none]";
		else {
			Train[] acc1 = trains.toArray(new Train[0]);
			Arrays.sort(acc1);
			List<Train> ss = Arrays.asList(acc1);
			for (Train s : trains)
				tns += (ss.indexOf(s) == 0 ? "\n\t" : "\t") + s + (ss.indexOf(s) != ss.size() - 1 ? "\n" : "\n\t]");
		}
		return "---------- ---------- ---------- ---------- ---------- ----------\nTrainSystem [\n\nstatus=" + status.getDescription()
				+ "\n\ntrains=" + tns + "\n\nroutes=" + rts + "\n\nsegments=" + sgs + "\n\nstations=" + sts
				+ "\n]\n---------- ---------- ---------- ---------- ---------- ----------";
	}

	public static void main(String[] args) {
		TrainSystem ts = new TrainSystem();

		ts.addStation("Stationx");
		ts.addStation("Alberb");
		ts.addStation("Trusty");
		ts.addStation("1tationx");

		ts.addSegment("Seg1", "Stationx", "Alberg");
		ts.addSegment("Seg2", "Alberg", "Trusty");
		ts.addSegment("Seg3", "Trusty", "1tationx");

		ArrayList<String> rs = new ArrayList<String>();
		rs.add("Seg1");
		rs.add("Seg2");
		rs.add("Seg3");
		ts.addRoute("R1", false, rs);

		ts.registerTrain(ts.addTrain(), "R1");
		ts.registerTrain(ts.addTrain(), "R1");
		
		System.out.println(ts);
	}
}
