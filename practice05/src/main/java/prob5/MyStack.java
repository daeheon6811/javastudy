package prob5;

public class MyStack {

	private String[] data;
	private int top = -1;
	private int size;

	public MyStack(int size) {
		top = -1;
		this.size = size;
		data = new String[this.size]; // 스

	}

	// 스택이 비어있는 상태인지 확인
	public boolean isEmpty() {
		return (top == -1);
	}

	// 스택이 가득찬 상태인지 확인
	public boolean isFull() {
		// 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우 false를 return
		return (top == this.size - 1);
	}

	// 스택에 데이터를 추가
	public void push(String item) {
		if (isFull()) {
			String[] temp = new String[this.size];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			size++;
			data = new String[this.size];
			for(int i = 0 ; i < temp.length; i++) {
				data[i] = temp[i];
			}
			data[++top] = item;
			

		} else {
			data[++top] = item; // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
		}
	}

	// 스택의 최상위(마지막) 데이터 추출 후 삭제
	public String pop() {
		if (isEmpty()) {

			return "";
		} else {

			return data[top--];
		}
	}

	// 스택의 최상위(마지막) 데이터 추출
	public String peek() {
		if (isEmpty()) {
			return "";
		} else {

			return data[top];
		}
	}

	// 스택 초기화
	public void clear() {
		if (isEmpty()) {
		} else {
			top = -1; // 스택 포인터 초기화
			data = new String[this.size]; // 새로운 스택 배열 생성

		}
	}

	// 스택에 저장된 모든 데이터를 출력
	public void printStack() {
		if (isEmpty()) {
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
	}

}