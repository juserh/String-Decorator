package hw.ch12;

public class MultiSideBorder extends Border{
	private char borderChar; // 장식이 되는 문자
	private int num;

	// 생성자에서, 내용물(display)과 장식 문자(ch)가 지정됨
	public MultiSideBorder(Display display, char ch, int num) { 
		super(display);
		this.borderChar = ch;
		this.num=num;
	}

	// 내용물의 문자 수에 2(내용물의 양쪽에 장식 문자분)를 더한다.
	public int getColumns() {
		return num + display.getColumns() + num;
	}

	// 줄수는 내용물의 줄수와 같으므로, 내용물의 getRows( )를 호출한다.
	public int getRows() { 
		return display.getRows();
	}

	// 지정한 줄의 내용물의 Text 양쪽에 장식 문자를 연결하여 반환한다.
	public String getRowText(int row) { 
		return makeLine(borderChar, num) + display.getRowText(row) + makeLine(borderChar, num);
	}
	
	private String makeLine(char ch, int count) {         // 문자ch를count개 연속 시킨 문자열을 만든다.
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
