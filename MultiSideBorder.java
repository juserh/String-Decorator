package hw.ch12;

public class MultiSideBorder extends Border{
	private char borderChar; // ����� �Ǵ� ����
	private int num;

	// �����ڿ���, ���빰(display)�� ��� ����(ch)�� ������
	public MultiSideBorder(Display display, char ch, int num) { 
		super(display);
		this.borderChar = ch;
		this.num=num;
	}

	// ���빰�� ���� ���� 2(���빰�� ���ʿ� ��� ���ں�)�� ���Ѵ�.
	public int getColumns() {
		return num + display.getColumns() + num;
	}

	// �ټ��� ���빰�� �ټ��� �����Ƿ�, ���빰�� getRows( )�� ȣ���Ѵ�.
	public int getRows() { 
		return display.getRows();
	}

	// ������ ���� ���빰�� Text ���ʿ� ��� ���ڸ� �����Ͽ� ��ȯ�Ѵ�.
	public String getRowText(int row) { 
		return makeLine(borderChar, num) + display.getRowText(row) + makeLine(borderChar, num);
	}
	
	private String makeLine(char ch, int count) {         // ����ch��count�� ���� ��Ų ���ڿ��� �����.
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
