package packing.implement;

public interface PackResult {
	/**
	 * Compare two results
	 *
	 * @param result to compare against
	 * @return true if this box is better than the argument
	 */
	boolean packsMoreBoxesThan(PackResult result);
	boolean isEmpty();
}
