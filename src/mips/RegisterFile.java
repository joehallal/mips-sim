package mips;

/**
 * The processor register file
 */
public class RegisterFile extends DataField {
	public RegisterFile() {
		super(32);
	}

	@Override
	public int get(int index) {
		if(index == 0) {
			return 0; // $zero register
		}
		return super.get(index);
	}

	@Override
	protected void set(int index, int value) {
		if(index == 0) {
			return;
		}
		super.set(index, value);
	}

	public static String name(int index) {
		String[] names = {
				"$zero", 
				"$at",
				"$v0",
				"$v1",
				"$a0",
				"$a1",
				"$a2",
				"$a3",
				"$t0",
				"$t1",
				"$t2",
				"$t3",
				"$t4",
				"$t5",
				"$t6",
				"$t7",
				"$s0",
				"$s1",
				"$s2",
				"$s3",
				"$s4",
				"$s5",
				"$s6",
				"$s7",
				"$t8",
				"$t9",
				"$k0",
				"$k1",
				"$gp",
				"$sp",
				"$fp",
				"$ra"
		};
		return names[index];
	}
}
