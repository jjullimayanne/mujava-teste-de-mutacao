public class TriTypTest {
    
    public class Testetrityp
    {
	public String test1()
		{
		TriTyp t = new TriTyp();
		String result = "";
		t.setI(3);
		t.setJ(5);
		t.setK(8);
		t.type();
		result=t.toString();
		return result;
	}
        
	public String test2()
		{
		TriTyp r = new TriTyp();
		String result = "";
		r.toString();
		r.type();
		r.setJ(8);
		r.setK(2);
		r.type();
		result=r.toString();
		return result;
	}
        
	public String test3()
		{
		TriTyp s = new TriTyp();
		String result = "";
		s.type();		
		s.toString();
		s.setI(1);		
		s.setJ(8);
		s.type();
		s.setJ(0);
		s.type();
		result=s.toString();
		return result;
	}
	
        public String test4()
		{
		TriTyp f = new TriTyp();
		String result = "";
		f.type();
		f.setI('A');		
		f.setJ('B');
		f.setK('C');
		f.type();
		result=f.toString();
		return result;
	}

	public String test5()
		{
		TriTyp g = new TriTyp();
		String result = "";
		g.toString();
		g.equals(g);
		result=g.toString();
		return result;
	}
        
	public String test6()
		{
		TriTyp h = new TriTyp();
		String result = "";
		h.setI(5);
		h.setJ(5);
		h.setK(5);
		h.type();
		result=h.toString();
		return result;
	}
        
	public String test7()
		{
		TriTyp i = new TriTyp();
		String result = "";
		i.setI(2);
		i.setJ(3);
		i.setK(2);
		i.type();
		result=i.toString();
		return result;
	}
        
	public String test8()
		{
		TriTyp j = new TriTyp();
		String result = "";
		j.setI(3);
		j.setJ(6);
		j.setK(7);
		j.type();
		result=j.toString();
		return result;
	}
        
	public String test9()
		{
		TriTyp k = new TriTyp();
		String result = "";
		k.setI(2);
		k.setJ(2);
		k.setK(1);
		k.type();
		result=k.toString();
		return result;
	}
	
        public String test10()
		{
		TriTyp l = new TriTyp();
		String result = "";
		l.setI('a');
		l.setJ(5);
		l.setK(3);
		l.type();
		result=l.toString();
		return result;
	}
        
	public String test11()
		{
		TriTyp m = new TriTyp();
		String result = "";
		m.setI(2);
		m.setJ('b');
		m.setK(3);
		m.type();
		result=m.toString();
		return result;
	}
    }
}
