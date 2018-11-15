package sgy.ui;

public enum EFace {
	UP(0), LEFT(1), DOWN(2), RIGHT(3);

	int value;

	private EFace(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static EFace getByValue(int value) {
		for (EFace e : EFace.values()) {
			if (e.getValue() == value) {
				return e;
			}
		}
		return null;
	}
}
