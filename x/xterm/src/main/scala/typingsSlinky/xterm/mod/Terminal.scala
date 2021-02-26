package typingsSlinky.xterm.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.xterm.anon.Cols
import typingsSlinky.xterm.anon.DomEvent
import typingsSlinky.xterm.anon.End
import typingsSlinky.xterm.xtermStrings.`100`
import typingsSlinky.xterm.xtermStrings.`200`
import typingsSlinky.xterm.xtermStrings.`300`
import typingsSlinky.xterm.xtermStrings.`400`
import typingsSlinky.xterm.xtermStrings.`500`
import typingsSlinky.xterm.xtermStrings.`600`
import typingsSlinky.xterm.xtermStrings.`700`
import typingsSlinky.xterm.xtermStrings.`800`
import typingsSlinky.xterm.xtermStrings.`900`
import typingsSlinky.xterm.xtermStrings.allowTransparency
import typingsSlinky.xterm.xtermStrings.bar
import typingsSlinky.xterm.xtermStrings.bellSound
import typingsSlinky.xterm.xtermStrings.bellStyle
import typingsSlinky.xterm.xtermStrings.block
import typingsSlinky.xterm.xtermStrings.bold
import typingsSlinky.xterm.xtermStrings.both
import typingsSlinky.xterm.xtermStrings.cancelEvents
import typingsSlinky.xterm.xtermStrings.convertEol
import typingsSlinky.xterm.xtermStrings.cursorBlink
import typingsSlinky.xterm.xtermStrings.cursorStyle
import typingsSlinky.xterm.xtermStrings.disableStdin
import typingsSlinky.xterm.xtermStrings.fontFamily
import typingsSlinky.xterm.xtermStrings.fontSize
import typingsSlinky.xterm.xtermStrings.fontWeight
import typingsSlinky.xterm.xtermStrings.fontWeightBold
import typingsSlinky.xterm.xtermStrings.letterSpacing
import typingsSlinky.xterm.xtermStrings.lineHeight
import typingsSlinky.xterm.xtermStrings.logLevel
import typingsSlinky.xterm.xtermStrings.macOptionIsMeta
import typingsSlinky.xterm.xtermStrings.none
import typingsSlinky.xterm.xtermStrings.normal
import typingsSlinky.xterm.xtermStrings.popOnBell
import typingsSlinky.xterm.xtermStrings.rendererType
import typingsSlinky.xterm.xtermStrings.rightClickSelectsWord
import typingsSlinky.xterm.xtermStrings.scrollback
import typingsSlinky.xterm.xtermStrings.sound
import typingsSlinky.xterm.xtermStrings.tabStopWidth
import typingsSlinky.xterm.xtermStrings.termName
import typingsSlinky.xterm.xtermStrings.theme
import typingsSlinky.xterm.xtermStrings.underline
import typingsSlinky.xterm.xtermStrings.visual
import typingsSlinky.xterm.xtermStrings.visualBell
import typingsSlinky.xterm.xtermStrings.windowsMode
import typingsSlinky.xterm.xtermStrings.wordSeparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xterm", "Terminal")
@js.native
/**
  * Creates a new `Terminal` object.
  *
  * @param options An object containing a set of options.
  */
class Terminal () extends IDisposable {
  def this(options: ITerminalOptions) = this()
  
  /**
    * @deprecated use `registerMarker` instead.
    */
  def addMarker(cursorYOffset: Double): js.UndefOr[IMarker] = js.native
  
  /**
    * Attaches a custom key event handler which is run before keys are
    * processed, giving consumers of xterm.js ultimate control as to what keys
    * should be processed by the terminal and what keys should not.
    * @param customKeyEventHandler The custom KeyboardEvent handler to attach.
    * This is a function that takes a KeyboardEvent, allowing consumers to stop
    * propagation and/or prevent the default action. The function returns
    * whether the event should be processed by xterm.js.
    */
  def attachCustomKeyEventHandler(customKeyEventHandler: js.Function1[/* event */ KeyboardEvent, Boolean]): Unit = js.native
  
  /**
    * Unfocus the terminal.
    */
  def blur(): Unit = js.native
  
  /**
    * (EXPERIMENTAL) The terminal's current buffer, this might be either the
    * normal buffer or the alt buffer depending on what's running in the
    * terminal.
    */
  val buffer: IBufferNamespace = js.native
  
  /**
    * Clear the entire buffer, making the prompt line the new first line.
    */
  def clear(): Unit = js.native
  
  /**
    * Clears the current terminal selection.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * The number of columns in the terminal's viewport. Use
    * `ITerminalOptions.cols` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val cols: Double = js.native
  
  /**
    * (EXPERIMENTAL) Deregisters the character joiner if one was registered.
    * NOTE: character joiners are only used by the canvas renderer.
    * @param joinerId The character joiner's ID (returned after register)
    */
  def deregisterCharacterJoiner(joinerId: Double): Unit = js.native
  
  /**
    * (EXPERIMENTAL) Deregisters a link matcher if it has been registered.
    * @deprecated The link matcher API is now deprecated in favor of the link
    * provider API, see `registerLinkProvider`.
    * @param matcherId The link matcher's ID (returned after register)
    */
  def deregisterLinkMatcher(matcherId: Double): Unit = js.native
  
  /**
    * The element containing the terminal.
    */
  val element: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Focus the terminal.
    */
  def focus(): Unit = js.native
  
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  def getOption(key: String): js.Any = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_allowTransparency(key: allowTransparency): Boolean = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_bellSound(key: bellSound): String = js.native
  @JSName("getOption")
  def getOption_bellStyle(key: bellStyle): String = js.native
  @JSName("getOption")
  def getOption_cancelEvents(key: cancelEvents): Boolean = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_cols(key: typingsSlinky.xterm.xtermStrings.cols): Double = js.native
  @JSName("getOption")
  def getOption_convertEol(key: convertEol): Boolean = js.native
  @JSName("getOption")
  def getOption_cursorBlink(key: cursorBlink): Boolean = js.native
  @JSName("getOption")
  def getOption_cursorStyle(key: cursorStyle): String = js.native
  @JSName("getOption")
  def getOption_disableStdin(key: disableStdin): Boolean = js.native
  @JSName("getOption")
  def getOption_fontFamily(key: fontFamily): String = js.native
  @JSName("getOption")
  def getOption_fontSize(key: fontSize): Double = js.native
  /**
    * Retrieves an option's value from the terminal.
    * @param key The option key.
    */
  @JSName("getOption")
  def getOption_fontWeight(key: fontWeight): FontWeight = js.native
  @JSName("getOption")
  def getOption_fontWeightBold(key: fontWeightBold): FontWeight = js.native
  @JSName("getOption")
  def getOption_letterSpacing(key: letterSpacing): Double = js.native
  @JSName("getOption")
  def getOption_lineHeight(key: lineHeight): Double = js.native
  @JSName("getOption")
  def getOption_logLevel(key: logLevel): String = js.native
  @JSName("getOption")
  def getOption_macOptionIsMeta(key: macOptionIsMeta): Boolean = js.native
  @JSName("getOption")
  def getOption_popOnBell(key: popOnBell): Boolean = js.native
  @JSName("getOption")
  def getOption_rendererType(key: rendererType): String = js.native
  @JSName("getOption")
  def getOption_rightClickSelectsWord(key: rightClickSelectsWord): Boolean = js.native
  @JSName("getOption")
  def getOption_rows(key: typingsSlinky.xterm.xtermStrings.rows): Double = js.native
  @JSName("getOption")
  def getOption_scrollback(key: scrollback): Double = js.native
  @JSName("getOption")
  def getOption_tabStopWidth(key: tabStopWidth): Double = js.native
  @JSName("getOption")
  def getOption_termName(key: termName): String = js.native
  @JSName("getOption")
  def getOption_visualBell(key: visualBell): Boolean = js.native
  @JSName("getOption")
  def getOption_windowsMode(key: windowsMode): Boolean = js.native
  @JSName("getOption")
  def getOption_wordSeparator(key: wordSeparator): String = js.native
  
  /**
    * Gets the terminal's current selection, this is useful for implementing
    * copy behavior outside of xterm.js.
    */
  def getSelection(): String = js.native
  
  /**
    * Gets the selection position or undefined if there is no selection.
    */
  def getSelectionPosition(): js.UndefOr[ISelectionPosition] = js.native
  
  /**
    * Gets whether the terminal has an active selection.
    */
  def hasSelection(): Boolean = js.native
  
  /**
    * Loads an addon into this instance of xterm.js.
    * @param addon The addon to load.
    */
  def loadAddon(addon: ITerminalAddon): Unit = js.native
  
  /**
    * (EXPERIMENTAL) Get all markers registered against the buffer. If the alt
    * buffer is active this will always return [].
    */
  val markers: js.Array[IMarker] = js.native
  
  /**
    * Adds an event listener for when a binary event fires. This is used to
    * enable non UTF-8 conformant binary messages to be sent to the backend.
    * Currently this is only used for a certain type of mouse reports that
    * happen to be not UTF-8 compatible.
    * The event value is a JS string, pass it to the underlying pty as
    * binary data, e.g. `pty.write(Buffer.from(data, 'binary'))`.
    * @returns an `IDisposable` to stop listening.
    */
  def onBinary(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a binary event fires. This is used to
    * enable non UTF-8 conformant binary messages to be sent to the backend.
    * Currently this is only used for a certain type of mouse reports that
    * happen to be not UTF-8 compatible.
    * The event value is a JS string, pass it to the underlying pty as
    * binary data, e.g. `pty.write(Buffer.from(data, 'binary'))`.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onBinary")
  var onBinary_Original: IEvent[String, Unit] = js.native
  
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  def onCursorMove(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for the cursor moves.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onCursorMove")
  var onCursorMove_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  def onData(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a data event fires. This happens for
    * example when the user types or pastes into the terminal. The event value
    * is whatever `string` results, in a typical setup, this should be passed
    * on to the backing pty.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onData")
  var onData_Original: IEvent[String, Unit] = js.native
  
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  def onKey(listener: js.Function2[/* arg1 */ DomEvent, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a key is pressed. The event value contains the
    * string that will be sent in the data event as well as the DOM event that
    * triggered it.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onKey")
  var onKey_Original: IEvent[DomEvent, Unit] = js.native
  
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  def onLineFeed(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a line feed is added.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onLineFeed")
  var onLineFeed_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  def onRender(listener: js.Function2[/* arg1 */ End, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when rows are rendered. The event value
    * contains the start row and end rows of the rendered area (ranges from `0`
    * to `Terminal.rows - 1`).
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onRender")
  var onRender_Original: IEvent[End, Unit] = js.native
  
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  def onResize(listener: js.Function2[/* arg1 */ Cols, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when the terminal is resized. The event value
    * contains the new size.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onResize")
  var onResize_Original: IEvent[Cols, Unit] = js.native
  
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  def onScroll(listener: js.Function2[/* arg1 */ Double, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a scroll occurs. The event value is the
    * new position of the viewport.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onScroll")
  var onScroll_Original: IEvent[Double, Unit] = js.native
  
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  def onSelectionChange(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when a selection change occurs.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onSelectionChange")
  var onSelectionChange_Original: IEvent[Unit, Unit] = js.native
  
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  def onTitleChange(listener: js.Function2[/* arg1 */ String, /* arg2 */ Unit, _]): IDisposable = js.native
  /**
    * Adds an event listener for when an OSC 0 or OSC 2 title change occurs.
    * The event value is the new title.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onTitleChange")
  var onTitleChange_Original: IEvent[String, Unit] = js.native
  
  /**
    * Opens the terminal within an element.
    * @param parent The element to create the terminal within. This element
    * must be visible (have dimensions) when `open` is called as several DOM-
    * based measurements need to be performed when this function is called.
    */
  def open(parent: HTMLElement): Unit = js.native
  
  /**
    * (EXPERIMENTAL) Get the parser interface to register
    * custom escape sequence handlers.
    */
  val parser: IParser = js.native
  
  /**
    * Writes text to the terminal, performing the necessary transformations for pasted text.
    * @param data The text to write to the terminal.
    */
  def paste(data: String): Unit = js.native
  
  /**
    * Tells the renderer to refresh terminal content between two rows
    * (inclusive) at the next opportunity.
    * @param start The row to start from (between 0 and this.rows - 1).
    * @param end The row to end at (between start and this.rows - 1).
    */
  def refresh(start: Double, end: Double): Unit = js.native
  
  /**
    * (EXPERIMENTAL) Registers a character joiner, allowing custom sequences of
    * characters to be rendered as a single unit. This is useful in particular
    * for rendering ligatures and graphemes, among other things.
    *
    * Each registered character joiner is called with a string of text
    * representing a portion of a line in the terminal that can be rendered as
    * a single unit. The joiner must return a sorted array, where each entry is
    * itself an array of length two, containing the start (inclusive) and end
    * (exclusive) index of a substring of the input that should be rendered as
    * a single unit. When multiple joiners are provided, the results of each
    * are collected. If there are any overlapping substrings between them, they
    * are combined into one larger unit that is drawn together.
    *
    * All character joiners that are registered get called every time a line is
    * rendered in the terminal, so it is essential for the handler function to
    * run as quickly as possible to avoid slowdowns when rendering. Similarly,
    * joiners should strive to return the smallest possible substrings to
    * render together, since they aren't drawn as optimally as individual
    * characters.
    *
    * NOTE: character joiners are only used by the canvas renderer.
    *
    * @param handler The function that determines character joins. It is called
    * with a string of text that is eligible for joining and returns an array
    * where each entry is an array containing the start (inclusive) and end
    * (exclusive) indexes of ranges that should be rendered as a single unit.
    * @return The ID of the new joiner, this can be used to deregister
    */
  def registerCharacterJoiner(handler: js.Function1[/* text */ String, js.Array[js.Tuple2[Double, Double]]]): Double = js.native
  
  /**
    * (EXPERIMENTAL) Registers a link matcher, allowing custom link patterns to
    * be matched and handled.
    * @deprecated The link matcher API is now deprecated in favor of the link
    * provider API, see `registerLinkProvider`.
    * @param regex The regular expression to search for, specifically this
    * searches the textContent of the rows. You will want to use \s to match a
    * space ' ' character for example.
    * @param handler The callback when the link is called.
    * @param options Options for the link matcher.
    * @return The ID of the new matcher, this can be used to deregister.
    */
  def registerLinkMatcher(regex: js.RegExp, handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit]): Double = js.native
  def registerLinkMatcher(
    regex: js.RegExp,
    handler: js.Function2[/* event */ MouseEvent, /* uri */ String, Unit],
    options: ILinkMatcherOptions
  ): Double = js.native
  
  /**
    * (EXPERIMENTAL) Registers a link provider, allowing a custom parser to
    * be used to match and handle links. Multiple link providers can be used,
    * they will be asked in the order in which they are registered.
    * @param linkProvider The link provider to use to detect links.
    */
  def registerLinkProvider(linkProvider: ILinkProvider): IDisposable = js.native
  
  /**
    * (EXPERIMENTAL) Adds a marker to the normal buffer and returns it. If the
    * alt buffer is active, undefined is returned.
    * @param cursorYOffset The y position offset of the marker from the cursor.
    * @returns The new marker or undefined.
    */
  def registerMarker(cursorYOffset: Double): js.UndefOr[IMarker] = js.native
  
  /**
    * Perform a full reset (RIS, aka '\x1bc').
    */
  def reset(): Unit = js.native
  
  /**
    * Resizes the terminal. It's best practice to debounce calls to resize,
    * this will help ensure that the pty can respond to the resize event
    * before another one occurs.
    * @param x The number of columns to resize to.
    * @param y The number of rows to resize to.
    */
  def resize(columns: Double, rows: Double): Unit = js.native
  
  /**
    * The number of rows in the terminal's viewport. Use
    * `ITerminalOptions.rows` to set this in the constructor and
    * `Terminal.resize` for when the terminal exists.
    */
  val rows: Double = js.native
  
  /**
    * Scroll the display of the terminal
    * @param amount The number of lines to scroll down (negative scroll up).
    */
  def scrollLines(amount: Double): Unit = js.native
  
  /**
    * Scroll the display of the terminal by a number of pages.
    * @param pageCount The number of pages to scroll (negative scrolls up).
    */
  def scrollPages(pageCount: Double): Unit = js.native
  
  /**
    * Scrolls the display of the terminal to the bottom.
    */
  def scrollToBottom(): Unit = js.native
  
  /**
    * Scrolls to a line within the buffer.
    * @param line The 0-based line index to scroll to.
    */
  def scrollToLine(line: Double): Unit = js.native
  
  /**
    * Scrolls the display of the terminal to the top.
    */
  def scrollToTop(): Unit = js.native
  
  /**
    * Selects text within the terminal.
    * @param column The column the selection starts at.
    * @param row The row the selection starts at.
    * @param length The length of the selection.
    */
  def select(column: Double, row: Double, length: Double): Unit = js.native
  
  /**
    * Selects all text within the terminal.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Selects text in the buffer between 2 lines.
    * @param start The 0-based line index to select from (inclusive).
    * @param end The 0-based line index to select to (inclusive).
    */
  def selectLines(start: Double, end: Double): Unit = js.native
  
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  def setOption(key: String, value: js.Any): Unit = js.native
  def setOption(key: bellStyle, value: both): Unit = js.native
  def setOption(key: bellStyle, value: none): Unit = js.native
  def setOption(key: bellStyle, value: sound): Unit = js.native
  def setOption(key: bellStyle, value: visual): Unit = js.native
  def setOption(key: cursorStyle, value: bar): Unit = js.native
  def setOption(key: cursorStyle, value: block): Unit = js.native
  def setOption(key: cursorStyle, value: underline): Unit = js.native
  def setOption(key: fontWeightBold, value: `100`): Unit = js.native
  def setOption(key: fontWeightBold, value: `200`): Unit = js.native
  def setOption(key: fontWeightBold, value: `300`): Unit = js.native
  def setOption(key: fontWeightBold, value: `400`): Unit = js.native
  def setOption(key: fontWeightBold, value: `500`): Unit = js.native
  def setOption(key: fontWeightBold, value: `600`): Unit = js.native
  def setOption(key: fontWeightBold, value: `700`): Unit = js.native
  def setOption(key: fontWeightBold, value: `800`): Unit = js.native
  def setOption(key: fontWeightBold, value: `900`): Unit = js.native
  def setOption(key: fontWeightBold, value: bold): Unit = js.native
  def setOption(key: fontWeightBold, value: normal): Unit = js.native
  def setOption(key: fontWeight, value: `100`): Unit = js.native
  def setOption(key: fontWeight, value: `200`): Unit = js.native
  def setOption(key: fontWeight, value: `300`): Unit = js.native
  def setOption(key: fontWeight, value: `400`): Unit = js.native
  def setOption(key: fontWeight, value: `500`): Unit = js.native
  def setOption(key: fontWeight, value: `600`): Unit = js.native
  def setOption(key: fontWeight, value: `700`): Unit = js.native
  def setOption(key: fontWeight, value: `800`): Unit = js.native
  def setOption(key: fontWeight, value: `900`): Unit = js.native
  def setOption(key: fontWeight, value: bold): Unit = js.native
  def setOption(key: fontWeight, value: normal): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_allowTransparency(key: allowTransparency, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_bellSound(key: bellSound, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_bellStyle(key: bellStyle): Unit = js.native
  @JSName("setOption")
  def setOption_cancelEvents(key: cancelEvents, value: Boolean): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cols(key: typingsSlinky.xterm.xtermStrings.cols, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_convertEol(key: convertEol, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_cursorBlink(key: cursorBlink, value: Boolean): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_cursorStyle(key: cursorStyle): Unit = js.native
  @JSName("setOption")
  def setOption_disableStdin(key: disableStdin, value: Boolean): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontFamily(key: fontFamily, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontSize(key: fontSize, value: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_fontWeight(key: fontWeight): Unit = js.native
  @JSName("setOption")
  def setOption_fontWeight(key: fontWeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_fontWeightBold(key: fontWeightBold): Unit = js.native
  @JSName("setOption")
  def setOption_fontWeightBold(key: fontWeightBold, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_letterSpacing(key: letterSpacing, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(key: lineHeight, value: Double): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_logLevel(key: logLevel, value: LogLevel): Unit = js.native
  @JSName("setOption")
  def setOption_macOptionIsMeta(key: macOptionIsMeta, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_popOnBell(key: popOnBell, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_rightClickSelectsWord(key: rightClickSelectsWord, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_rows(key: typingsSlinky.xterm.xtermStrings.rows, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(key: scrollback, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_tabStopWidth(key: tabStopWidth, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_termName(key: termName, value: String): Unit = js.native
  /**
    * Sets an option on the terminal.
    * @param key The option key.
    * @param value The option value.
    */
  @JSName("setOption")
  def setOption_theme(key: theme, value: ITheme): Unit = js.native
  @JSName("setOption")
  def setOption_visualBell(key: visualBell, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_windowsMode(key: windowsMode, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_wordSeparator(key: wordSeparator, value: String): Unit = js.native
  
  /**
    * The textarea that accepts input for the terminal.
    */
  val textarea: js.UndefOr[HTMLTextAreaElement] = js.native
  
  /**
    * (EXPERIMENTAL) Get the Unicode handling interface
    * to register and switch Unicode version.
    */
  val unicode: IUnicodeHandling = js.native
  
  /**
    * Write data to the terminal.
    * @param data The data to write to the terminal. This can either be raw
    * bytes given as Uint8Array from the pty or a string. Raw bytes will always
    * be treated as UTF-8 encoded, string data as UTF-16.
    * @param callback Optional callback that fires when the data was processed
    * by the parser.
    */
  def write(data: String): Unit = js.native
  def write(data: String, callback: js.Function0[Unit]): Unit = js.native
  def write(data: js.typedarray.Uint8Array): Unit = js.native
  def write(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Write UTF8 data to the terminal.
    * @param data The data to write to the terminal.
    * @param callback Optional callback when data was processed.
    * @deprecated use `write` instead
    */
  def writeUtf8(data: js.typedarray.Uint8Array): Unit = js.native
  def writeUtf8(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Writes data to the terminal, followed by a break line character (\n).
    * @param data The data to write to the terminal. This can either be raw
    * bytes given as Uint8Array from the pty or a string. Raw bytes will always
    * be treated as UTF-8 encoded, string data as UTF-16.
    * @param callback Optional callback that fires when the data was processed
    * by the parser.
    */
  def writeln(data: String): Unit = js.native
  def writeln(data: String, callback: js.Function0[Unit]): Unit = js.native
  def writeln(data: js.typedarray.Uint8Array): Unit = js.native
  def writeln(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
}
/* static members */
object Terminal {
  
  @JSImport("xterm", "Terminal")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Natural language strings that can be localized.
    */
  @JSImport("xterm", "Terminal.strings")
  @js.native
  def strings: ILocalizableStrings = js.native
  @scala.inline
  def strings_=(x: ILocalizableStrings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strings")(x.asInstanceOf[js.Any])
}
