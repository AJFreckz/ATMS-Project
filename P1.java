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
