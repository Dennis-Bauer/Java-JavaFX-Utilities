package de.dennis.lieferkette.Utils;

/**
 * <h2>Utilities for Java and JavaFx to create graphical programs</h2>
 * <p>
 * These utilities are intended to simplify programming with Java/JavaFX
 * and keep the code clean. In this specific version the method to write
 * to the console is updated. You can choose your console text color and
 * text style to make the beauty of your console text fuller than ever.
 * <p>
 * <h3>Infos for this specific version:</h3>
 * <p>
 * Nop, you don't have to know anything to use this.
 * <p>
 * 
 * @author bauer
 * @version 1.1
 * @since 16.03.2024
 */

public class ConsoleUtilities {

  private static final boolean DEFAULT_BAR_SHOW_PERCENT = false;
  private static final char DEFAULT_BAR_CHAR = '━';
  private static final int DEFAULT_BAR_SIZE = 100;
  private static final colors DEFAULT_BAR_COLOR_EMPTY = colors.BLACK;
  private static final colors DEFAULT_BAR_COLOR_FULL = colors.WHITE;

  public static final String RESET = "\033[0m"; // Text Reset

  public enum colors { // Color Values
    BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE
  }

  public enum textStyle { // Style Values
    REGULAR, BOLD, UNDERLINE, BACKGROUND, HIGH_INTENSITY, BOLD_HIGH_INTENSITY, HIGH_INTENSITY_BACKGROUNDS
  }

  /**
   * This method outputs modified text to the console and outputs the text in a
   * text line
   * 
   * @param color
   *        This input sets the Color of the text.
   * @param style
   *        This input sets the Style of the text.
   * @param text
   *        This is the text that will be output.
   */
  public static void consoleOutPutLine(colors color, textStyle style, String text) {
    System.out.println(getTextCode(color, style) + text + RESET);
  }

  /**
   * This method outputs modified text to the console and outputs the text
   * 
   * @param color
   *        This input sets the Color of the text.
   * @param style
   *        This input sets the Style of the text.
   * @param text
   *        This is the text that will be output.
   */
  public static void consoleOutPut(colors color, textStyle style, String text) {
    System.out.print(getTextCode(color, style) + text + RESET);
  }

  /**
   * Creates a progress bar with the given settings.
   *
   * @param goalAmount
   *        The goal number to reach.
   * @return A progress bar object.
   */
  public static ProgressBar createProgressBar(int goalAmount) {
    return new ProgressBar(goalAmount, DEFAULT_BAR_SHOW_PERCENT, DEFAULT_BAR_CHAR, DEFAULT_BAR_COLOR_EMPTY,
        DEFAULT_BAR_COLOR_FULL, DEFAULT_BAR_SIZE);
  }

  /**
   * Creates a progress bar with the given settings.
   *
   * @param goalAmount
   *        The goal number to reach.
   * @param showPercent
   *        Set to `true` if you want to show a percentage after the progress bar.
   *        Set to `false` if you want to show the progress as `progress/goal`.
   * @return A progress bar object.
   */
  public static ProgressBar createProgressBar(int goalAmount, boolean showPercent) {
    return new ProgressBar(goalAmount, showPercent, DEFAULT_BAR_CHAR, DEFAULT_BAR_COLOR_EMPTY, DEFAULT_BAR_COLOR_FULL,
        DEFAULT_BAR_SIZE);
  }

  /**
   * Creates a progress bar with the given settings.
   *
   * @param goalAmount
   *        The goal number to reach.
   * @param showPercent
   *        Set to `true` if you want to show a percentage after the progress bar.
   *        Set to `false` if you want to show the progress as `progress/goal`.
   * @param barSize
   *        The length of the progress bar.
   * @return A progress bar object.
   */
  public static ProgressBar createProgressBar(int goalAmount, boolean showPercent, int barSize) {
    return new ProgressBar(goalAmount, showPercent, DEFAULT_BAR_CHAR, DEFAULT_BAR_COLOR_EMPTY, DEFAULT_BAR_COLOR_FULL,
        barSize);
  }

  /**
   * Creates a progress bar with the given settings.
   *
   * @param goalAmount
   *        The goal number to reach.
   * @param showPercent
   *        Set to `true` if you want to show a percentage after the progress bar.
   *        Set to `false` if you want to show the progress as `progress/goal`.
   * @param barChar
   *        The character that represents the progress bar.
   * @param barColorEmpty
   *        The color of the empty part of the progress bar.
   * @param barColorFull
   *        The color of the full part of the progress bar.
   * @return A progress bar object.
   */
  public static ProgressBar createProgressBar(int goalAmount, boolean showPercent, char barChar, colors barColorEmpty,
      colors barColorFull) {
    return new ProgressBar(goalAmount, showPercent, barChar, barColorEmpty, barColorFull, DEFAULT_BAR_SIZE);
  }

  /**
   * Creates a progress bar with the given settings.
   *
   * @param goalAmount
   *        The goal number to reach.
   * @param showPercent
   *        Set to `true` if you want to show a percentage after the progress bar.
   *        Set to `false` if you want to show the progress as `progress/goal`.
   * @param barChar
   *        The character that represents the progress bar.
   * @param barColorEmpty
   *        The color of the empty part of the progress bar.
   * @param barColorFull
   *        The color of the full part of the progress bar.
   * @param barSize
   *        The length of the progress bar.
   * @return A progress bar object.
   */
  public static ProgressBar createProgressBar(int goalAmount, boolean showPercent, char barChar, colors barColorEmpty,
      colors barColorFull, int barSize) {
    return new ProgressBar(goalAmount, showPercent, barChar, barColorEmpty, barColorFull, barSize);
  }

  /**
   * This method generates the text code that sets the color and style.
   * 
   * @param color
   *        This input says what color the text code should contain.
   * @param style
   *        This input says what style the text code should contain.
   * @return Returns the text code.
   */
  private static String getTextCode(colors color, textStyle style) {
    String colorCode = "\033[";
    switch (style) {
      case REGULAR, UNDERLINE, BOLD -> {
        switch (style) {
          case REGULAR -> colorCode = colorCode + "0;";
          case BOLD -> colorCode = colorCode + "1;";
          case UNDERLINE -> colorCode = colorCode + "4;";
          default -> {
          } // Ignored, not possible!
        }

        switch (color) {
          case BLACK -> colorCode = colorCode + "30m";
          case RED -> colorCode = colorCode + "31m";
          case GREEN -> colorCode = colorCode + "32m";
          case YELLOW -> colorCode = colorCode + "33m";
          case BLUE -> colorCode = colorCode + "34m";
          case PURPLE -> colorCode = colorCode + "35m";
          case CYAN -> colorCode = colorCode + "36m";
          case WHITE -> colorCode = colorCode + "37m";
        }

      }
      case BACKGROUND -> {
        switch (color) {
          case BLACK -> colorCode = colorCode + "40m";
          case RED -> colorCode = colorCode + "41m";
          case GREEN -> colorCode = colorCode + "42m";
          case YELLOW -> colorCode = colorCode + "43m";
          case BLUE -> colorCode = colorCode + "44m";
          case PURPLE -> colorCode = colorCode + "45m";
          case CYAN -> colorCode = colorCode + "46m";
          case WHITE -> colorCode = colorCode + "47m";
        }
      }
      case HIGH_INTENSITY, BOLD_HIGH_INTENSITY -> {
        switch (style) {
          case HIGH_INTENSITY -> colorCode = colorCode + "0;";
          case BOLD_HIGH_INTENSITY -> colorCode = colorCode + "1;";
          default -> {
          } // Ignored, not possible!
        }
        switch (color) {
          case BLACK -> colorCode = colorCode + "90m";
          case RED -> colorCode = colorCode + "91m";
          case GREEN -> colorCode = colorCode + "92m";
          case YELLOW -> colorCode = colorCode + "93m";
          case BLUE -> colorCode = colorCode + "94m";
          case PURPLE -> colorCode = colorCode + "95m";
          case CYAN -> colorCode = colorCode + "96m";
          case WHITE -> colorCode = colorCode + "97m";
        }
      }
      case HIGH_INTENSITY_BACKGROUNDS -> {
        switch (color) {
          case BLACK -> colorCode = colorCode + "0;100m";
          case RED -> colorCode = colorCode + "0;101m";
          case GREEN -> colorCode = colorCode + "0;102m";
          case YELLOW -> colorCode = colorCode + "0;103m";
          case BLUE -> colorCode = colorCode + "0;104m";
          case PURPLE -> colorCode = colorCode + "0;105m";
          case CYAN -> colorCode = colorCode + "0;106m";
          case WHITE -> colorCode = colorCode + "0;107m";
        }
      }
      default -> System.out.println("Error, cannot print this typ!");

    }
    return colorCode;
  }

  public static class ProgressBar {

    private final int goal;
    private final boolean showPercent;
    private final char barChar;
    private final int barSize;
    private final colors barColorEmpty;
    private final colors barColorFull;

    private boolean showBar = true;
    private int progress = 0;

    /**
     * With the progressbar object you can control the progress bar in many ways.
     * 
     * @param goalAmount
     *        The goal number to reach.
     * @param showPercent
     *        Set to `true` if you want to show a percentage after the progress bar.
     *        Set to `false` if you want to show the progress as `progress/goal`.
     * @param barChar
     *        The character that represents the progress bar.
     * @param barColorEmpty
     *        The color of the empty part of the progress bar.
     * @param barColorFull
     *        The color of the full part of the progress bar.
     * @param barSize
     *        The length of the progress bar.
     */
    public ProgressBar(int goalAmount, boolean showPercent, char barChar, colors barColorEmpty, colors barColorFull,
        int barSize) {
      this.goal = goalAmount;
      this.showPercent = showPercent;
      this.barChar = barChar;
      this.barColorEmpty = barColorEmpty;
      this.barColorFull = barColorFull;
      this.barSize = barSize;
    }

    /**
     * Sets the progress to 0
     */
    public void clearProgress() {
      this.progress = 0;
      updateBar();
    }

    /**
     * Set the progress to the given value
     * 
     * @param progress
     *        The value to what the progress should get set
     */
    public void setProgress(int progress) {
      this.progress = progress;
      if (this.showBar)
        updateBar();
    }

    /**
     * Increases the progress by one
     */
    public void increasesProgress() {
      this.progress++;
      if (this.showBar)
        updateBar();
    }

    /**
     * Adds the given number to the progress
     * 
     * @param amount
     *        The amount which should get added to the progress
     */
    public void addToProgress(int amount) {
      this.progress = this.progress + amount;
      if (this.showBar)
        updateBar();
    }

    /**
     * Hides the progressbar
     */
    public void hide() {
      if (this.showBar) {
        this.showBar = false;
        this.updateBar();
      }
    }

    /**
     * Shows the progress bar
     */
    public void show() {
      if (!this.showBar) {
        this.showBar = true;
        this.updateBar();
      }
    }

    /**
     * Updates the progressbar
     */
    private void updateBar() {

      if (!this.showBar) {
        System.out.print(
            "\r" + " ".repeat(this.barSize + 15) + "\n");
        return;
      }

      if (this.goal >= this.progress) {
        int filled = (int) Math.floor((double) this.progress / this.goal * this.barSize);

        StringBuilder bar = new StringBuilder();

        bar.append(getTextCode(barColorFull, textStyle.BOLD))
            .append((this.barChar + "").repeat(filled))
            .append(getTextCode(barColorEmpty, textStyle.BOLD))
            .append((this.barChar + "").repeat(this.barSize - filled))
            .append(RESET);

        String prefix;
        if (showPercent) {
          int percent = (int) Math.floor((double) ((double) this.progress / (double) this.goal) * 100);

          // System.out.println(((double) this.progress / (double) this.goal) * 100);

          prefix = (this.progress >= this.goal ? 100 : percent) + "% ";
        } else {
          prefix = String.format("%02d", this.progress) + "/" + this.goal + " ";
        }

        System.out.print(
            "\r" + bar.toString() + " " + prefix);
      }

    }

  }
}
