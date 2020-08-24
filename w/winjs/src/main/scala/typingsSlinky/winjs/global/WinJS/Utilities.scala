package typingsSlinky.winjs.global.WinJS

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.winjs.WinJS.Utilities.ILogOptions
import typingsSlinky.winjs.WinJS.Utilities.IPosition
import typingsSlinky.winjs.WinJS.Utilities.Scheduler.IJob
import typingsSlinky.winjs.WinJS.Utilities.Scheduler.IJobInfo
import typingsSlinky.winjs.WinJS.Utilities.Scheduler.IOwnerToken
import typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority
import typingsSlinky.winjs.anon.ScrollLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides helper functions, for example, functions to add and remove CSS classes.
**/
@JSGlobal("WinJS.Utilities")
@js.native
object Utilities extends js.Object {
  /**
    * Represents the result of a query selector, and provides various operations that perform actions over the elements of the collection.
    **/
  @js.native
  class QueryCollection[T] ()
    extends typingsSlinky.winjs.WinJS.Utilities.QueryCollection[T]
  
  //#endregion Functions
  //#region Properties
  /**
    * Gets whether the current script context has access to WinRT APIs.
    **/
  var hasWinRT: Boolean = js.native
  /**
    * Determines if strict declarative processing is enabled in this script context.
    **/
  var strictProcessing: Boolean = js.native
  //#endregion Objects
  //#region Functions
  /**
    * Adds the specified class to the specified element.
    * @param e The element to which to add the class.
    * @param name The name of the class to add.
    * @returns The element.
    **/
  def addClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
  /**
    * Gets a collection of elements that are the direct children of the specified element.
    * @param element The parent element.
    * @returns The collection of children of the element.
    **/
  def children(element: HTMLElement): typingsSlinky.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = js.native
  /**
    * Converts a CSS positioning string for the specified element to pixels.
    * @param element The element.
    * @param value The CSS positioning string.
    * @returns The number of pixels.
    **/
  def convertToPixels(element: HTMLElement, value: String): Double = js.native
  /**
    * Creates an object that has one event for each name passed to the function.
    * @param events A variable list of property names.
    * @returns The object with the specified properties. The names of the properties are prefixed with 'on'.
    **/
  def createEventProperties(events: String*): js.Any = js.native
  /**
    * Gets the data value associated with the specified element.
    * @param element The element.
    * @returns The value associated with the element.
    **/
  def data(element: HTMLElement): js.Any = js.native
  /**
    * Disposes all first-generation disposable elements that are descendents of the specified element. The specified element itself is not disposed.
    * @param element The root element whose sub-tree is to be disposed.
    **/
  def disposeSubTree(element: HTMLElement): Unit = js.native
  /**
    * Removes all the child nodes from the specified element.
    * @param element The element.
    * @returns The element.
    **/
  def empty[T /* <: HTMLElement */](element: T): T = js.native
  /**
    * Determines whether the specified event occurred within the specified element.
    * @param element The element.
    * @param event The event.
    * @returns true if the event occurred within the element; otherwise, false.
    **/
  def eventWithinElement(element: HTMLElement, event: Event): Boolean = js.native
  /**
    * Adds tags and type to a logging message.
    * @param message The message to be formatted.
    * @param tag The tag(s) to be applied to the message. Multiple tags should be separated by spaces.
    * @param type The type of the message.
    * @returns The formatted message.
    **/
  def formatLog(message: String, tag: String, `type`: String): String = js.native
  /**
    * Gets the height of the content of the specified element. The content height does not include borders or padding.
    * @param element The element.
    * @returns The content height of the element.
    **/
  def getContentHeight(element: HTMLElement): Double = js.native
  /**
    * Gets the width of the content of the specified element. The content width does not include borders or padding.
    * @param element The element.
    * @returns The content width of the element.
    **/
  def getContentWidth(element: HTMLElement): Double = js.native
  /**
    * Gets the leaf-level type or namespace specified by the name parameter.
    * @param name The name of the member.
    * @param root The root to start in. Defaults to the global object.
    * @returns The leaf-level type or namespace in the specified parent namespace.
    **/
  def getMember(name: String): js.Any = js.native
  def getMember(name: String, root: js.Any): js.Any = js.native
  /**
    * Gets the position of the specified element.
    * @param element The element.
    * @returns An object that contains the left, top, width and height properties of the element.
    **/
  def getPosition(element: HTMLElement): IPosition = js.native
  /**
    * Gets the left coordinate of the specified element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative left coordinate.
    **/
  def getRelativeLeft(): Double = js.native
  def getRelativeLeft(element: js.UndefOr[scala.Nothing], parent: HTMLElement): Double = js.native
  def getRelativeLeft(element: HTMLElement): Double = js.native
  def getRelativeLeft(element: HTMLElement, parent: HTMLElement): Double = js.native
  /**
    * Gets the top coordinate of the element relative to the specified parent.
    * @param element The element.
    * @param parent The parent element.
    * @returns The relative top coordinate.
    **/
  def getRelativeTop(): Double = js.native
  def getRelativeTop(element: js.UndefOr[scala.Nothing], parent: HTMLElement): Double = js.native
  def getRelativeTop(element: HTMLElement): Double = js.native
  def getRelativeTop(element: HTMLElement, parent: HTMLElement): Double = js.native
  /**
    * Gets the scrollLeft and scrollTop of the specified element, adjusting the scrollLeft to change from browser specific coordinates to logical coordinates when in RTL.
    * @param element The element.
    * @returns An object with two properties: scrollLeft and scrollTop
    **/
  def getScrollPosition(element: HTMLElement): ScrollLeft = js.native
  /**
    * Gets the tab index of the specified element.
    * @param element The element
    * @returns The tabIndex of the element. Returns -1 if the element cannot be tabbed to.
    **/
  def getTabIndex(element: HTMLElement): Double = js.native
  /**
    * Gets the height of the element, including its margins.
    * @param element The element.
    * @returns The height of the element including margins.
    **/
  def getTotalHeight(element: HTMLElement): Double = js.native
  /**
    * Gets the width of the element, including margins.
    * @param element The element.
    * @returns The width of the element including margins.
    **/
  def getTotalWidth(element: HTMLElement): Double = js.native
  /**
    * Determines whether the specified element has the specified class.
    * @param e The element.
    * @param name The name of the class.
    * @returns true if the element has the class, otherwise false.
    **/
  def hasClass(e: HTMLElement, name: String): Boolean = js.native
  /**
    * Returns a collection with zero or one elements matching the specified id.
    * @param id The ID of the element (or elements).
    * @returns A collection of elements whose id matches the id parameter.
    **/
  def id(id: String): typingsSlinky.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = js.native
  /**
    * Calls insertAdjacentHTML on the specified element.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text The text to insert.
    **/
  def insertAdjacentHTML(element: HTMLElement, position: String, text: String): Unit = js.native
  /**
    * Calls insertAdjacentHTML on the specified element in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which insertAdjacentHTML is to be called.
    * @param position The position relative to the element at which to insert the HTML. Possible values are: beforebegin, afterbegin, beforeend, afterend.
    * @param text Value to be provided to insertAdjacentHTML.
    **/
  def insertAdjacentHTMLUnsafe(element: HTMLElement, position: String, text: String): Unit = js.native
  /**
    * Attaches the default dispose API wrapping the dispose implementation to the specified element.
    * @param element The element to mark as disposable.
    * @param disposeImpl The function containing the element-specific dispose logic, called by the dispose function that markDisposable attaches.
    **/
  def markDisposable(element: HTMLElement): Unit = js.native
  def markDisposable(element: HTMLElement, disposeImpl: js.Function): Unit = js.native
  /**
    * Marks a function as being compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll.
    * @param func The function to be marked as compatible with declarative processing.
    * @returns The input function, marked as compatible with declarative processing.
    **/
  def markSupportedForProcessing[U /* <: js.Function */](func: U): U = js.native
  /**
    * Returns a QueryCollection with zero or one elements matching the specified selector query.
    * @param query The CSS selector to use. See Selectors for more information.
    * @param element Optional. The root element at which to start the query. If this parameter is omitted, the scope of the query is the entire document.
    * @returns A QueryCollection with zero or one elements matching the specified selector query.
    **/
  def query(query: js.Any): typingsSlinky.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = js.native
  def query(query: js.Any, element: HTMLElement): typingsSlinky.winjs.WinJS.Utilities.QueryCollection[HTMLElement] = js.native
  /**
    * Ensures that the specified function executes only after the DOMContentLoaded event has fired for the current page. The DOMContentLoaded event occurs after the page has been parsed but before all the resources are loaded.
    * @param callback A function that executes after the DOMContentLoaded event has occurred.
    * @param async If true, the callback should be executed asynchronously.
    * @returns A promise that completes after the DOMContentLoaded event has occurred.
    **/
  def ready(): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  def ready(callback: js.UndefOr[scala.Nothing], async: Boolean): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  def ready(callback: js.Function): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  def ready(callback: js.Function, async: Boolean): typingsSlinky.winjs.WinJS.Promise[_] = js.native
  /**
    * Removes the specified class from the specified element.
    * @param e The element from which to remove the class.
    * @param name The name of the class to remove.
    * @returns The element.
    **/
  def removeClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
  /**
    * Asserts that the value is compatible with declarative processing. Declarative processing is performed by WinJS.UI.processAll or WinJS.Binding.processAll. If the value is not compatible, and strictProcessing is on, an exception is thrown. All functions that have been declared using WinJS.Class.define, WinJS.Class.derive, WinJS.UI.Pages.define, or WinJS.Binding.converter are automatically marked as supported for declarative processing. Any other function that you use from a declarative context (that is, a context in which an HTML element has a data-win-control or data-win-options attribute) must be marked manually by calling this function. When you mark a function as supported for declarative processing, you are guaranteeing that the code in the function is secure from injection of third-party content.
    * @param value The value to be tested for compatibility with declarative processing. If the value is a function it must be marked with a property supportedForProcessing with a value of true when strictProcessing is on. For more information, see WinJS.Utilities.markSupportedForProcessing.
    * @returns The input value.
    **/
  def requireSupportedForProcessing[T](value: T): T = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTML(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the innerHTML property of the specified element to the specified text.
    * @param element The element on which the innerHTML property is to be set.
    * @param text The value to be set to the innerHTML property.
    **/
  def setInnerHTMLUnsafe(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTML(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the outerHTML property of the specified element to the specified text in the context of MSApp.execUnsafeLocalFunction.
    * @param element The element on which the outerHTML property is to be set.
    * @param text The value to be set to the outerHTML property.
    **/
  def setOuterHTMLUnsafe(element: HTMLElement, text: String): Unit = js.native
  /**
    * Sets the scrollLeft and scrollTop of the specified element, changing the scrollLeft from logical coordinates to browser-specific coordinates when in RTL.
    * @param element The element.
    * @param position An object describing the position to set.
    **/
  def setScrollPosition(element: HTMLElement, position: ScrollLeft): Unit = js.native
  /**
    * Configures a logger that writes messages containing the specified tags to the JavaScript console.
    * @param options The tags for messages to log. Multiple tags should be separated by spaces. May contain type, tags, excludeTags and action properties.
    **/
  def startLog(): Unit = js.native
  def startLog(options: ILogOptions): Unit = js.native
  def startLog(tags: String): Unit = js.native
  /**
    * Removes the WinJS logger that had previously been set up.
    **/
  def stopLog(): Unit = js.native
  /**
    * Toggles (adds or removes) the specified class on the specified element. If the class is present, it is removed; if it is absent, it is added.
    * @param e The element on which to toggle the class.
    * @param name The name of the class to toggle.
    * @returns The element.
    **/
  def toggleClass[T /* <: HTMLElement */](e: T, name: String): T = js.native
  //#region Enumerations
  /**
    * Defines a set of keyboard values.
    **/
  @js.native
  object Key extends js.Object {
    /* 74 */ val F1: typingsSlinky.winjs.WinJS.Utilities.Key.F1 with Double = js.native
    /* 83 */ val F10: typingsSlinky.winjs.WinJS.Utilities.Key.F10 with Double = js.native
    /* 84 */ val F11: typingsSlinky.winjs.WinJS.Utilities.Key.F11 with Double = js.native
    /* 85 */ val F12: typingsSlinky.winjs.WinJS.Utilities.Key.F12 with Double = js.native
    /* 75 */ val F2: typingsSlinky.winjs.WinJS.Utilities.Key.F2 with Double = js.native
    /* 76 */ val F3: typingsSlinky.winjs.WinJS.Utilities.Key.F3 with Double = js.native
    /* 77 */ val F4: typingsSlinky.winjs.WinJS.Utilities.Key.F4 with Double = js.native
    /* 78 */ val F5: typingsSlinky.winjs.WinJS.Utilities.Key.F5 with Double = js.native
    /* 79 */ val F6: typingsSlinky.winjs.WinJS.Utilities.Key.F6 with Double = js.native
    /* 80 */ val F7: typingsSlinky.winjs.WinJS.Utilities.Key.F7 with Double = js.native
    /* 81 */ val F8: typingsSlinky.winjs.WinJS.Utilities.Key.F8 with Double = js.native
    /* 82 */ val F9: typingsSlinky.winjs.WinJS.Utilities.Key.F9 with Double = js.native
    /* 105 */ val GamepadA: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadA with Double = js.native
    /* 106 */ val GamepadB: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadB with Double = js.native
    /* 114 */ val GamepadDPadDown: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadDPadDown with Double = js.native
    /* 115 */ val GamepadDPadLeft: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadDPadLeft with Double = js.native
    /* 116 */ val GamepadDPadRight: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadDPadRight with Double = js.native
    /* 113 */ val GamepadDPadUp: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadDPadUp with Double = js.native
    /* 110 */ val GamepadLeftShoulder: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftShoulder with Double = js.native
    /* 119 */ val GamepadLeftThumbstick: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftThumbstick with Double = js.native
    /* 122 */ val GamepadLeftThumbstickDown: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickDown with Double = js.native
    /* 124 */ val GamepadLeftThumbstickLeft: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickLeft with Double = js.native
    /* 123 */ val GamepadLeftThumbstickRight: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickRight with Double = js.native
    /* 121 */ val GamepadLeftThumbstickUp: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftThumbstickUp with Double = js.native
    /* 111 */ val GamepadLeftTrigger: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadLeftTrigger with Double = js.native
    /* 117 */ val GamepadMenu: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadMenu with Double = js.native
    /* 109 */ val GamepadRightShoulder: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightShoulder with Double = js.native
    /* 120 */ val GamepadRightThumbstick: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightThumbstick with Double = js.native
    /* 126 */ val GamepadRightThumbstickDown: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightThumbstickDown with Double = js.native
    /* 128 */ val GamepadRightThumbstickLeft: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightThumbstickLeft with Double = js.native
    /* 127 */ val GamepadRightThumbstickRight: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightThumbstickRight with Double = js.native
    /* 125 */ val GamepadRightThumbstickUp: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightThumbstickUp with Double = js.native
    /* 112 */ val GamepadRightTrigger: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadRightTrigger with Double = js.native
    /* 118 */ val GamepadView: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadView with Double = js.native
    /* 107 */ val GamepadX: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadX with Double = js.native
    /* 108 */ val GamepadY: typingsSlinky.winjs.WinJS.Utilities.Key.GamepadY with Double = js.native
    /* 133 */ val IME: typingsSlinky.winjs.WinJS.Utilities.Key.IME with Double = js.native
    /* 92 */ val NavigationAccept: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationAccept with Double = js.native
    /* 93 */ val NavigationCancel: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationCancel with Double = js.native
    /* 89 */ val NavigationDown: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationDown with Double = js.native
    /* 90 */ val NavigationLeft: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationLeft with Double = js.native
    /* 87 */ val NavigationMenu: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationMenu with Double = js.native
    /* 91 */ val NavigationRight: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationRight with Double = js.native
    /* 88 */ val NavigationUp: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationUp with Double = js.native
    /* 86 */ val NavigationView: typingsSlinky.winjs.WinJS.Utilities.Key.NavigationView with Double = js.native
    /* 30 */ val a: typingsSlinky.winjs.WinJS.Utilities.Key.a with Double = js.native
    /* 70 */ val add: typingsSlinky.winjs.WinJS.Utilities.Key.add with Double = js.native
    /* 5 */ val alt: typingsSlinky.winjs.WinJS.Utilities.Key.alt with Double = js.native
    /* 31 */ val b: typingsSlinky.winjs.WinJS.Utilities.Key.b with Double = js.native
    /* 130 */ val backSlash: typingsSlinky.winjs.WinJS.Utilities.Key.backSlash with Double = js.native
    /* 0 */ val backspace: typingsSlinky.winjs.WinJS.Utilities.Key.backspace with Double = js.native
    /* 96 */ val browserBack: typingsSlinky.winjs.WinJS.Utilities.Key.browserBack with Double = js.native
    /* 97 */ val browserForward: typingsSlinky.winjs.WinJS.Utilities.Key.browserForward with Double = js.native
    /* 32 */ val c: typingsSlinky.winjs.WinJS.Utilities.Key.c with Double = js.native
    /* 7 */ val capsLock: typingsSlinky.winjs.WinJS.Utilities.Key.capsLock with Double = js.native
    /* 131 */ val closeBracket: typingsSlinky.winjs.WinJS.Utilities.Key.closeBracket with Double = js.native
    /* 100 */ val comma: typingsSlinky.winjs.WinJS.Utilities.Key.comma with Double = js.native
    /* 4 */ val ctrl: typingsSlinky.winjs.WinJS.Utilities.Key.ctrl with Double = js.native
    /* 33 */ val d: typingsSlinky.winjs.WinJS.Utilities.Key.d with Double = js.native
    /* 101 */ val dash: typingsSlinky.winjs.WinJS.Utilities.Key.dash with Double = js.native
    /* 72 */ val decimalPoint: typingsSlinky.winjs.WinJS.Utilities.Key.decimalPoint with Double = js.native
    /* 19 */ val deleteKey: typingsSlinky.winjs.WinJS.Utilities.Key.deleteKey with Double = js.native
    /* 73 */ val divide: typingsSlinky.winjs.WinJS.Utilities.Key.divide with Double = js.native
    /* 17 */ val downArrow: typingsSlinky.winjs.WinJS.Utilities.Key.downArrow with Double = js.native
    /* 34 */ val e: typingsSlinky.winjs.WinJS.Utilities.Key.e with Double = js.native
    /* 12 */ val end: typingsSlinky.winjs.WinJS.Utilities.Key.end with Double = js.native
    /* 2 */ val enter: typingsSlinky.winjs.WinJS.Utilities.Key.enter with Double = js.native
    /* 99 */ val equal: typingsSlinky.winjs.WinJS.Utilities.Key.equal with Double = js.native
    /* 8 */ val escape: typingsSlinky.winjs.WinJS.Utilities.Key.escape with Double = js.native
    /* 35 */ val f: typingsSlinky.winjs.WinJS.Utilities.Key.f with Double = js.native
    /* 103 */ val forwardSlash: typingsSlinky.winjs.WinJS.Utilities.Key.forwardSlash with Double = js.native
    /* 36 */ val g: typingsSlinky.winjs.WinJS.Utilities.Key.g with Double = js.native
    /* 104 */ val graveAccent: typingsSlinky.winjs.WinJS.Utilities.Key.graveAccent with Double = js.native
    /* 37 */ val h: typingsSlinky.winjs.WinJS.Utilities.Key.h with Double = js.native
    /* 13 */ val home: typingsSlinky.winjs.WinJS.Utilities.Key.home with Double = js.native
    /* 38 */ val i: typingsSlinky.winjs.WinJS.Utilities.Key.i with Double = js.native
    /* 18 */ val insert: typingsSlinky.winjs.WinJS.Utilities.Key.insert with Double = js.native
    /* 39 */ val j: typingsSlinky.winjs.WinJS.Utilities.Key.j with Double = js.native
    /* 40 */ val k: typingsSlinky.winjs.WinJS.Utilities.Key.k with Double = js.native
    /* 41 */ val l: typingsSlinky.winjs.WinJS.Utilities.Key.l with Double = js.native
    /* 14 */ val leftArrow: typingsSlinky.winjs.WinJS.Utilities.Key.leftArrow with Double = js.native
    /* 56 */ val leftWindows: typingsSlinky.winjs.WinJS.Utilities.Key.leftWindows with Double = js.native
    /* 42 */ val m: typingsSlinky.winjs.WinJS.Utilities.Key.m with Double = js.native
    /* 58 */ val menu: typingsSlinky.winjs.WinJS.Utilities.Key.menu with Double = js.native
    /* 69 */ val multiply: typingsSlinky.winjs.WinJS.Utilities.Key.multiply with Double = js.native
    /* 43 */ val n: typingsSlinky.winjs.WinJS.Utilities.Key.n with Double = js.native
    /* 20 */ val num0: typingsSlinky.winjs.WinJS.Utilities.Key.num0 with Double = js.native
    /* 21 */ val num1: typingsSlinky.winjs.WinJS.Utilities.Key.num1 with Double = js.native
    /* 22 */ val num2: typingsSlinky.winjs.WinJS.Utilities.Key.num2 with Double = js.native
    /* 23 */ val num3: typingsSlinky.winjs.WinJS.Utilities.Key.num3 with Double = js.native
    /* 24 */ val num4: typingsSlinky.winjs.WinJS.Utilities.Key.num4 with Double = js.native
    /* 25 */ val num5: typingsSlinky.winjs.WinJS.Utilities.Key.num5 with Double = js.native
    /* 26 */ val num6: typingsSlinky.winjs.WinJS.Utilities.Key.num6 with Double = js.native
    /* 27 */ val num7: typingsSlinky.winjs.WinJS.Utilities.Key.num7 with Double = js.native
    /* 28 */ val num8: typingsSlinky.winjs.WinJS.Utilities.Key.num8 with Double = js.native
    /* 29 */ val num9: typingsSlinky.winjs.WinJS.Utilities.Key.num9 with Double = js.native
    /* 94 */ val numLock: typingsSlinky.winjs.WinJS.Utilities.Key.numLock with Double = js.native
    /* 59 */ val numPad0: typingsSlinky.winjs.WinJS.Utilities.Key.numPad0 with Double = js.native
    /* 60 */ val numPad1: typingsSlinky.winjs.WinJS.Utilities.Key.numPad1 with Double = js.native
    /* 61 */ val numPad2: typingsSlinky.winjs.WinJS.Utilities.Key.numPad2 with Double = js.native
    /* 62 */ val numPad3: typingsSlinky.winjs.WinJS.Utilities.Key.numPad3 with Double = js.native
    /* 63 */ val numPad4: typingsSlinky.winjs.WinJS.Utilities.Key.numPad4 with Double = js.native
    /* 64 */ val numPad5: typingsSlinky.winjs.WinJS.Utilities.Key.numPad5 with Double = js.native
    /* 65 */ val numPad6: typingsSlinky.winjs.WinJS.Utilities.Key.numPad6 with Double = js.native
    /* 66 */ val numPad7: typingsSlinky.winjs.WinJS.Utilities.Key.numPad7 with Double = js.native
    /* 67 */ val numPad8: typingsSlinky.winjs.WinJS.Utilities.Key.numPad8 with Double = js.native
    /* 68 */ val numPad9: typingsSlinky.winjs.WinJS.Utilities.Key.numPad9 with Double = js.native
    /* 44 */ val o: typingsSlinky.winjs.WinJS.Utilities.Key.o with Double = js.native
    /* 129 */ val openBracket: typingsSlinky.winjs.WinJS.Utilities.Key.openBracket with Double = js.native
    /* 45 */ val p: typingsSlinky.winjs.WinJS.Utilities.Key.p with Double = js.native
    /* 11 */ val pageDown: typingsSlinky.winjs.WinJS.Utilities.Key.pageDown with Double = js.native
    /* 10 */ val pageUp: typingsSlinky.winjs.WinJS.Utilities.Key.pageUp with Double = js.native
    /* 6 */ val pause: typingsSlinky.winjs.WinJS.Utilities.Key.pause with Double = js.native
    /* 102 */ val period: typingsSlinky.winjs.WinJS.Utilities.Key.period with Double = js.native
    /* 46 */ val q: typingsSlinky.winjs.WinJS.Utilities.Key.q with Double = js.native
    /* 47 */ val r: typingsSlinky.winjs.WinJS.Utilities.Key.r with Double = js.native
    /* 16 */ val rightArrow: typingsSlinky.winjs.WinJS.Utilities.Key.rightArrow with Double = js.native
    /* 57 */ val rightWindows: typingsSlinky.winjs.WinJS.Utilities.Key.rightWindows with Double = js.native
    /* 48 */ val s: typingsSlinky.winjs.WinJS.Utilities.Key.s with Double = js.native
    /* 95 */ val scrollLock: typingsSlinky.winjs.WinJS.Utilities.Key.scrollLock with Double = js.native
    /* 98 */ val semicolon: typingsSlinky.winjs.WinJS.Utilities.Key.semicolon with Double = js.native
    /* 3 */ val shift: typingsSlinky.winjs.WinJS.Utilities.Key.shift with Double = js.native
    /* 132 */ val singleQuote: typingsSlinky.winjs.WinJS.Utilities.Key.singleQuote with Double = js.native
    /* 9 */ val space: typingsSlinky.winjs.WinJS.Utilities.Key.space with Double = js.native
    /* 71 */ val subtract: typingsSlinky.winjs.WinJS.Utilities.Key.subtract with Double = js.native
    /* 49 */ val t: typingsSlinky.winjs.WinJS.Utilities.Key.t with Double = js.native
    /* 1 */ val tab: typingsSlinky.winjs.WinJS.Utilities.Key.tab with Double = js.native
    /* 50 */ val u: typingsSlinky.winjs.WinJS.Utilities.Key.u with Double = js.native
    /* 15 */ val upArrow: typingsSlinky.winjs.WinJS.Utilities.Key.upArrow with Double = js.native
    /* 51 */ val v: typingsSlinky.winjs.WinJS.Utilities.Key.v with Double = js.native
    /* 52 */ val w: typingsSlinky.winjs.WinJS.Utilities.Key.w with Double = js.native
    /* 53 */ val x: typingsSlinky.winjs.WinJS.Utilities.Key.x with Double = js.native
    /* 54 */ val y: typingsSlinky.winjs.WinJS.Utilities.Key.y with Double = js.native
    /* 55 */ val z: typingsSlinky.winjs.WinJS.Utilities.Key.z with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winjs.WinJS.Utilities.Key with Double] = js.native
  }
  
  /* static members */
  @js.native
  object QueryCollection extends js.Object {
    //#endregion Methods
    /**
      * Indicates that the object is compatibile with declarative processing.
      **/
    var supportedForProcessing: Boolean = js.native
  }
  
  /**
    * Provides functions and objects for scheduling and managing asynchronous tasks.
  **/
  @js.native
  object Scheduler extends js.Object {
    //#endregion Interfaces
    //#region Properties
    /**
      * Gets the current priority at which the caller is executing.
      **/
    var currentPriority: Priority = js.native
    //#endregion Properties
    //#region Functions
    /**
      * Creates and returns a new IOwnerToken which can be set to the owner property of one or more jobs.
      * @returns A new IOwnerToken which can be set to the owner property of one or more jobs.
      **/
    def createOwnerToken(): IOwnerToken = js.native
    /**
      * Runs the specified callback in a high priority context.
      * @param callback The callback to run in a high priority callback.
      * @returns The return value of the callback.
      **/
    def execHigh[U](callback: js.Function0[U]): U = js.native
    /**
      * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
      * @param priority The priority to which the scheduler should drain. The default is -15.
      * @param name An optional description of the drain request for diagnostics.
      * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
      **/
    def requestDrain(): typingsSlinky.winjs.WinJS.Promise[_] = js.native
    def requestDrain(priority: js.UndefOr[scala.Nothing], name: String): typingsSlinky.winjs.WinJS.Promise[_] = js.native
    def requestDrain(priority: Priority): typingsSlinky.winjs.WinJS.Promise[_] = js.native
    def requestDrain(priority: Priority, name: String): typingsSlinky.winjs.WinJS.Promise[_] = js.native
    /**
      * Returns a string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      * @returns A string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
      **/
    def retrieveState(): String = js.native
    /**
      * Schedules the specified function to execute asynchronously.
      * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
      * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
      * @param thisArg A "this" instance to be bound to the work item. The default value is null.
      * @param name A description of the work item for diagnostics. The default value is an empty string.
      * @returns The job instance that represents this work item.
      **/
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _]): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: js.UndefOr[scala.Nothing],
      thisArg: js.UndefOr[scala.Nothing],
      name: String
    ): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: js.UndefOr[scala.Nothing],
      thisArg: js.Any
    ): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: js.UndefOr[scala.Nothing],
      thisArg: js.Any,
      name: String
    ): IJob = js.native
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority): IJob = js.native
    def schedule(
      work: js.Function1[/* jobInfo */ IJobInfo, _],
      priority: Priority,
      thisArg: js.UndefOr[scala.Nothing],
      name: String
    ): IJob = js.native
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority, thisArg: js.Any): IJob = js.native
    def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority, thisArg: js.Any, name: String): IJob = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.aboveNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of aboveNormal priority.
      **/
    def schedulePromiseAboveNormal[U](): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: U, jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseAboveNormal[U](promiseValue: js.UndefOr[scala.Nothing], jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.belowNormal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of belowNormal priority.
      **/
    def schedulePromiseBelowNormal[U](): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: U, jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseBelowNormal[U](promiseValue: js.UndefOr[scala.Nothing], jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.high priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of high priority.
      **/
    def schedulePromiseHigh[U](): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: U, jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseHigh[U](promiseValue: js.UndefOr[scala.Nothing], jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of idle priority.
      **/
    def schedulePromiseIdle[U](): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: U, jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseIdle[U](promiseValue: js.UndefOr[scala.Nothing], jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    /**
      * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
      * @param promiseValue The value returned by the completed Promise.
      * @param jobName A string that describes the job for diagnostic purposes.
      * @returns A Promise that completes within a job of normal priority.
      **/
    def schedulePromiseNormal[U](): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: U, jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    def schedulePromiseNormal[U](promiseValue: js.UndefOr[scala.Nothing], jobName: String): typingsSlinky.winjs.WinJS.Promise[U] = js.native
    //#region Enumerations
    /**
      * Represents a priority for a job managed by the Scheduler.
      **/
    @js.native
    object Priority extends js.Object {
      /* 0 */ val aboveNormal: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.aboveNormal with Double = js.native
      /* 1 */ val belowNormal: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.belowNormal with Double = js.native
      /* 2 */ val high: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.high with Double = js.native
      /* 3 */ val idle: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.idle with Double = js.native
      /* 4 */ val max: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.max with Double = js.native
      /* 5 */ val min: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.min with Double = js.native
      /* 6 */ val normal: typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority.normal with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winjs.WinJS.Utilities.Scheduler.Priority with Double] = js.native
    }
    
  }
  
  //#endregion Enumerations
  //#region Objects
  /**
    * A mixin that contains event-related functions.
    **/
  @js.native
  object eventMixin extends js.Object {
    //#region Methods
    /**
      * Adds an event listener to the control.
      * @param type The type (name) of the event.
      * @param listener The listener to invoke when the event gets raised.
      * @param useCapture If true, initiates capture, otherwise false.
      **/
    def addEventListener(`type`: String, listener: js.Function): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
    /**
      * Raises an event of the specified type and with the specified additional properties.
      * @param type The type (name) of the event.
      * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
      * @returns true if preventDefault was called on the event.
      **/
    def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
    /**
      * Removes an event listener from the control.
      * @param type The type (name) of the event.
      * @param listener The listener to remove.
      * @param useCapture true if capture is to be initiated, otherwise false.
      **/
    def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  }
  
}

