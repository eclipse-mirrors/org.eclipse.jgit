import static java.nio.charset.StandardCharsets.UTF_8;
	public FileHeader(byte[] headerLines, EditList edits, PatchType type) {
	FileHeader(byte[] b, int offset) {
	 * ({@link java.nio.charset.StandardCharsets#UTF_8}) is assumed for both the
			if (cs == null) {
				cs = UTF_8;
			}
		for (HunkHeader h : getHunks())
	private static boolean trySimpleConversion(Charset[] charsetGuess) {
	private String[] extractFileLines(Charset[] csGuess) {
			for (HunkHeader h : getHunks())
				if (cs == null) {
					cs = UTF_8;
				}
	void addHunk(HunkHeader h) {
	HunkHeader newHunkHeader(int offset) {
		for (HunkHeader hunk : hunks)
	int parseGitFileName(int ptr, int end) {
					oldPath = decode(UTF_8, buf, aStart, sp - 1);
	int parseGitHeaders(int ptr, int end) {
	void parseOldName(int ptr, int eol) {
	void parseNewName(int ptr, int eol) {
	void parseNewFileMode(int ptr, int eol) {
	int parseTraditionalHeaders(int ptr, int end) {
	private String parseName(String expect, int ptr, int end) {
			r = decode(UTF_8, buf, ptr, tab - 1);
	FileMode parseFileMode(int ptr, int end) {
	void parseIndexLine(int ptr, int end) {
	static int isHunkHdr(byte[] buf, int start, int end) {