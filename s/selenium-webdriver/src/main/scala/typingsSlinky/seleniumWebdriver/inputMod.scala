package typingsSlinky.seleniumWebdriver

import typingsSlinky.seleniumWebdriver.anon.Async
import typingsSlinky.seleniumWebdriver.anon.AsyncBoolean
import typingsSlinky.seleniumWebdriver.anon.Bridge
import typingsSlinky.seleniumWebdriver.anon.X
import typingsSlinky.seleniumWebdriver.commandMod.Executor
import typingsSlinky.seleniumWebdriver.mod.ILocation
import typingsSlinky.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("selenium-webdriver/lib/input", "Actions")
  @js.native
  class Actions protected () extends StObject {
    // region Constructors
    def this(executor: Executor) = this()
    def this(executor: Executor, options: Async) = this()
    def this(executor: Executor, options: AsyncBoolean) = this()
    def this(executor: Executor, options: Bridge) = this()
    
    /**
      * Executes this action sequence.
      * @return {!Promise} A promise that will be resolved once
      *     this sequence has completed.
      */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Clicks a mouse button.
      *
      * If an element is provided, the mouse will first be moved to the center
      * of that element. This is equivalent to:
      *
      *     sequence.mouseMove(element).click()
      *
      * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
      *     the element to interact with or the button to click with.
      *     Defaults to {@link input.Button.LEFT} if neither an element nor
      *     button is specified.
      * @param {input.Button=} opt_button The button to use. Defaults to
      *     {@link input.Button.LEFT}. Ignored if a button is provided as the
      *     first argument.
      * @return {!Actions} A self reference.
      */
    def click(): Actions = js.native
    def click(opt_elementOrButton: js.UndefOr[scala.Nothing], opt_button: String): Actions = js.native
    def click(opt_elementOrButton: String): Actions = js.native
    def click(opt_elementOrButton: String, opt_button: String): Actions = js.native
    def click(opt_elementOrButton: WebElement): Actions = js.native
    def click(opt_elementOrButton: WebElement, opt_button: String): Actions = js.native
    
    /**
      * Short-hand for performing a simple right-click (down/up) with the mouse.
      *
      * @param {./webdriver.WebElement=} element If specified, the mouse will
      *     first be moved to the center of the element before performing the
      *     click.
      * @return {!Actions} a self reference.
      */
    def contextClick(): Actions = js.native
    def contextClick(opt_elementOrButton: String): Actions = js.native
    def contextClick(opt_elementOrButton: WebElement): Actions = js.native
    
    /**
      * Double-clicks a mouse button.
      *
      * If an element is provided, the mouse will first be moved to the center of
      * that element. This is equivalent to:
      *
      *     sequence.mouseMove(element).doubleClick()
      *
      * Warning: this method currently only supports the left mouse button. See
      * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
      *
      * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
      *     the element to interact with or the button to click with.
      *     Defaults to {@link input.Button.LEFT} if neither an element nor
      *     button is specified.
      * @param {input.Button=} opt_button The button to use. Defaults to
      *     {@link input.Button.LEFT}. Ignored if a button is provided as the
      *     first argument.
      * @return {!Actions} A self reference.
      */
    def doubleClick(): Actions = js.native
    def doubleClick(opt_elementOrButton: js.UndefOr[scala.Nothing], opt_button: String): Actions = js.native
    def doubleClick(opt_elementOrButton: String): Actions = js.native
    def doubleClick(opt_elementOrButton: String, opt_button: String): Actions = js.native
    def doubleClick(opt_elementOrButton: WebElement): Actions = js.native
    def doubleClick(opt_elementOrButton: WebElement, opt_button: String): Actions = js.native
    
    /**
      * Convenience function for performing a 'drag and drop' manuever. The target
      * element may be moved to the location of another element, or by an offset (in
      * pixels).
      */
    def dragAndDrop(from: WebElement): Actions = js.native
    def dragAndDrop(from: WebElement, to: X): Actions = js.native
    def dragAndDrop(from: WebElement, to: WebElement): Actions = js.native
    
    /**
      * Performs a modifier key press. The modifier key is <em>not released</em>
      * until {@link #keyUp} or {@link #sendKeys} is called. The key press will be
      * targetted at the currently focused element.
      * @param {!Key} key The modifier key to push. Must be one of
      *     {ALT, CONTROL, SHIFT, COMMAND, META}.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def keyDown(key: String): Actions = js.native
    
    /**
      * Performs a modifier key release. The release is targetted at the currently
      * focused element.
      * @param {!Key} key The modifier key to release. Must be one of
      *     {ALT, CONTROL, SHIFT, COMMAND, META}.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def keyUp(key: String): Actions = js.native
    
    // endregion
    // region Methods
    def keyboard(): Keyboard = js.native
    
    def mouse(): Pointer = js.native
    
    /**
      * Presses a mouse button. The mouse button will not be released until
      * {@link #mouseUp} is called, regardless of whether that call is made in this
      * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
      * click) is undefined.
      *
      * If an element is provided, the mouse will first be moved to the center
      * of that element. This is equivalent to:
      *
      *     sequence.mouseMove(element).mouseDown()
      *
      * Warning: this method currently only supports the left mouse button. See
      * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
      *
      * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
      *     the element to interact with or the button to click with.
      *     Defaults to {@link input.Button.LEFT} if neither an element nor
      *     button is specified.
      * @param {input.Button=} opt_button The button to use. Defaults to
      *     {@link input.Button.LEFT}. Ignored if a button is provided as the
      *     first argument.
      * @return {!Actions} A self reference.
      */
    def mouseDown(): Actions = js.native
    def mouseDown(opt_elementOrButton: js.UndefOr[scala.Nothing], opt_button: String): Actions = js.native
    def mouseDown(opt_elementOrButton: String): Actions = js.native
    def mouseDown(opt_elementOrButton: String, opt_button: String): Actions = js.native
    def mouseDown(opt_elementOrButton: WebElement): Actions = js.native
    def mouseDown(opt_elementOrButton: WebElement, opt_button: String): Actions = js.native
    
    def mouseMove(location: ILocation): Actions = js.native
    def mouseMove(location: ILocation, opt_offset: ILocation): Actions = js.native
    /**
      * Moves the mouse.  The location to move to may be specified in terms of the
      * mouse's current location, an offset relative to the top-left corner of an
      * element, or an element (in which case the middle of the element is used).
      *
      * @param {(!./WebElement|{x: number, y: number})} location The
      *     location to drag to, as either another WebElement or an offset in
      *     pixels.
      * @param {{x: number, y: number}=} opt_offset If the target {@code location}
      *     is defined as a {@link ./WebElement}, this parameter defines
      *     an offset within that element. The offset should be specified in pixels
      *     relative to the top-left corner of the element's bounding box. If
      *     omitted, the element's center will be used as the target offset.
      * @return {!Actions} A self reference.
      */
    def mouseMove(location: WebElement): Actions = js.native
    def mouseMove(location: WebElement, opt_offset: ILocation): Actions = js.native
    
    /**
      * Releases a mouse button. Behavior is undefined for calling this function
      * without a previous call to {@link #mouseDown}.
      *
      * If an element is provided, the mouse will first be moved to the center
      * of that element. This is equivalent to:
      *
      *     sequence.mouseMove(element).mouseUp()
      *
      * Warning: this method currently only supports the left mouse button. See
      * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
      *
      * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
      *     the element to interact with or the button to click with.
      *     Defaults to {@link input.Button.LEFT} if neither an element nor
      *     button is specified.
      * @param {input.Button=} opt_button The button to use. Defaults to
      *     {@link input.Button.LEFT}. Ignored if a button is provided as the
      *     first argument.
      * @return {!Actions} A self reference.
      */
    def mouseUp(): Actions = js.native
    def mouseUp(opt_elementOrButton: js.UndefOr[scala.Nothing], opt_button: String): Actions = js.native
    def mouseUp(opt_elementOrButton: String): Actions = js.native
    def mouseUp(opt_elementOrButton: String, opt_button: String): Actions = js.native
    def mouseUp(opt_elementOrButton: WebElement): Actions = js.native
    def mouseUp(opt_elementOrButton: WebElement, opt_button: String): Actions = js.native
    
    /**
      * Inserts an action for moving the mouse `x` and `y` pixels relative to the
      * specified `origin`. The `origin` may be defined as the mouse's
      * {@linkplain ./input.Origin.POINTER current position}, the
      * {@linkplain ./input.Origin.VIEWPORT viewport}, or the center of a specific
      * {@linkplain ./webdriver.WebElement WebElement}.
      *
      * You may adjust how long the remote end should take, in milliseconds, to
      * perform the move using the `duration` parameter (defaults to 100 ms).
      * The number of incremental move events generated over this duration is an
      * implementation detail for the remote end.
      *
      * Defaults to moving the mouse to the top-left
      *     corner of the viewport over 100ms.
      */
    def move(direction: IDirection): Actions = js.native
    
    def pause(duration: js.UndefOr[scala.Nothing], devices: Device*): Actions = js.native
    def pause(duration: Double, devices: Device*): Actions = js.native
    def pause(duration: Device, devices: Device*): Actions = js.native
    
    /**
      * Executes this action sequence.
      * @return {!Promise} A promise that will be resolved once
      *     this sequence has completed.
      */
    def perform(): js.Promise[Unit] = js.native
    
    /**
      * Inserts an action to press a mouse button at the mouse's current location.
      * Defaults to `LEFT`.
      */
    def press(): Actions = js.native
    def press(button: Button): Actions = js.native
    
    /**
      * Inserts an action to release a mouse button at the mouse's current
      * location.  Defaults to `LEFT`.
      */
    def release(): Actions = js.native
    def release(button: Button): Actions = js.native
    
    /**
      * Simulates typing multiple keys. Each modifier key encountered in the
      * sequence will not be released until it is encountered again. All key events
      * will be targeted at the currently focused element.
      *
      * @param {...(string|!input.Key|!Array<(string|!input.Key)>)} var_args
      *     The keys to type.
      * @return {!Actions} A self reference.
      * @throws {Error} If the key is not a valid modifier key.
      */
    def sendKeys(var_args: (String | js.Promise[String])*): Actions = js.native
  }
  
  @js.native
  sealed trait Button extends StObject
  @JSImport("selenium-webdriver/lib/input", "Button")
  @js.native
  object Button extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Button with Double] = js.native
    
    @js.native
    sealed trait LEFT extends Button
    /* 0 */ val LEFT: typingsSlinky.seleniumWebdriver.inputMod.Button.LEFT with Double = js.native
    
    @js.native
    sealed trait MIDDLE extends Button
    /* 1 */ val MIDDLE: typingsSlinky.seleniumWebdriver.inputMod.Button.MIDDLE with Double = js.native
    
    @js.native
    sealed trait RIGHT extends Button
    /* 2 */ val RIGHT: typingsSlinky.seleniumWebdriver.inputMod.Button.RIGHT with Double = js.native
  }
  
  @JSImport("selenium-webdriver/lib/input", "Device")
  @js.native
  class Device protected () extends StObject {
    def this(`type`: String, id: String) = this()
  }
  
  @JSImport("selenium-webdriver/lib/input", "INTERNAL_COMPUTE_OFFSET_SCRIPT")
  @js.native
  val INTERNAL_COMPUTE_OFFSET_SCRIPT: String = js.native
  
  @JSImport("selenium-webdriver/lib/input", "Key")
  @js.native
  val Key: IKey = js.native
  
  @JSImport("selenium-webdriver/lib/input", "Keyboard")
  @js.native
  class Keyboard protected () extends Device {
    def this(`type`: String, id: String) = this()
  }
  
  @js.native
  sealed trait Origin extends StObject
  @JSImport("selenium-webdriver/lib/input", "Origin")
  @js.native
  object Origin extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Origin with String] = js.native
    
    /** Compute offsets relative to the pointer's current position. */
    @js.native
    sealed trait POINTER extends Origin
    /* "pointer" */ val POINTER: typingsSlinky.seleniumWebdriver.inputMod.Origin.POINTER with String = js.native
    
    /** Compute offsets relative to the viewport. */
    @js.native
    sealed trait VIEWPORT extends Origin
    /* "viewport" */ val VIEWPORT: typingsSlinky.seleniumWebdriver.inputMod.Origin.VIEWPORT with String = js.native
  }
  
  @JSImport("selenium-webdriver/lib/input", "Pointer")
  @js.native
  class Pointer protected () extends Device {
    def this(`type`: String, id: String) = this()
  }
  
  @js.native
  trait IDirection extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var origin: js.UndefOr[Origin | WebElement] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object IDirection {
    
    @scala.inline
    def apply(): IDirection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirection]
    }
    
    @scala.inline
    implicit class IDirectionMutableBuilder[Self <: IDirection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOrigin(value: Origin | WebElement): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait IKey extends StObject {
    
    var ADD: String = js.native
    
    var ALT: String = js.native
    
    var ARROW_DOWN: String = js.native
    
    var ARROW_LEFT: String = js.native
    
    var ARROW_RIGHT: String = js.native
    
    var ARROW_UP: String = js.native
    
    var BACK_SPACE: String = js.native
    
    var CANCEL: String = js.native
    
    var CLEAR: String = js.native
    
    var COMMAND: String = js.native
    
    var CONTROL: String = js.native
    
    var DECIMAL: String = js.native
    
    var DELETE: String = js.native
    
    var DIVIDE: String = js.native
    
    var DOWN: String = js.native
    
    var END: String = js.native
    
    var ENTER: String = js.native
    
    var EQUALS: String = js.native
    
    var ESCAPE: String = js.native
    
    var F1: String = js.native
    
    var F10: String = js.native
    
    var F11: String = js.native
    
    var F12: String = js.native
    
    // function keys
    var F2: String = js.native
    
    var F3: String = js.native
    
    var F4: String = js.native
    
    var F5: String = js.native
    
    var F6: String = js.native
    
    var F7: String = js.native
    
    var F8: String = js.native
    
    var F9: String = js.native
    
    // ^break
    var HELP: String = js.native
    
    var HOME: String = js.native
    
    var INSERT: String = js.native
    
    var LEFT: String = js.native
    
    // Apple command key
    var META: String = js.native
    
    var MULTIPLY: String = js.native
    
    var NULL: String = js.native
    
    var NUMPAD0: String = js.native
    
    // number pad keys
    var NUMPAD1: String = js.native
    
    var NUMPAD2: String = js.native
    
    var NUMPAD3: String = js.native
    
    var NUMPAD4: String = js.native
    
    var NUMPAD5: String = js.native
    
    var NUMPAD6: String = js.native
    
    var NUMPAD7: String = js.native
    
    var NUMPAD8: String = js.native
    
    var NUMPAD9: String = js.native
    
    var PAGE_DOWN: String = js.native
    
    var PAGE_UP: String = js.native
    
    var PAUSE: String = js.native
    
    var RETURN: String = js.native
    
    var RIGHT: String = js.native
    
    var SEMICOLON: String = js.native
    
    var SEPARATOR: String = js.native
    
    var SHIFT: String = js.native
    
    var SPACE: String = js.native
    
    var SUBTRACT: String = js.native
    
    var TAB: String = js.native
    
    var UP: String = js.native
    
    // alias for Windows key
    /**
      * Simulate pressing many keys at once in a 'chord'. Takes a sequence of
      * keys or strings, appends each of the values to a string,
      * and adds the chord termination key ({@link Key.NULL}) and returns
      * the resulting string.
      *
      * Note: when the low-level webdriver key handlers see Keys.NULL, active
      * modifier keys (CTRL/ALT/SHIFT/etc) release via a keyup event.
      *
      * @param {...string} var_args The key sequence to concatenate.
      * @return {string} The null-terminated key sequence.
      */
    def chord(var_args: (String | IKey)*): String = js.native
  }
  object IKey {
    
    @scala.inline
    def apply(
      ADD: String,
      ALT: String,
      ARROW_DOWN: String,
      ARROW_LEFT: String,
      ARROW_RIGHT: String,
      ARROW_UP: String,
      BACK_SPACE: String,
      CANCEL: String,
      CLEAR: String,
      COMMAND: String,
      CONTROL: String,
      DECIMAL: String,
      DELETE: String,
      DIVIDE: String,
      DOWN: String,
      END: String,
      ENTER: String,
      EQUALS: String,
      ESCAPE: String,
      F1: String,
      F10: String,
      F11: String,
      F12: String,
      F2: String,
      F3: String,
      F4: String,
      F5: String,
      F6: String,
      F7: String,
      F8: String,
      F9: String,
      HELP: String,
      HOME: String,
      INSERT: String,
      LEFT: String,
      META: String,
      MULTIPLY: String,
      NULL: String,
      NUMPAD0: String,
      NUMPAD1: String,
      NUMPAD2: String,
      NUMPAD3: String,
      NUMPAD4: String,
      NUMPAD5: String,
      NUMPAD6: String,
      NUMPAD7: String,
      NUMPAD8: String,
      NUMPAD9: String,
      PAGE_DOWN: String,
      PAGE_UP: String,
      PAUSE: String,
      RETURN: String,
      RIGHT: String,
      SEMICOLON: String,
      SEPARATOR: String,
      SHIFT: String,
      SPACE: String,
      SUBTRACT: String,
      TAB: String,
      UP: String,
      chord: /* repeated */ String | IKey => String
    ): IKey = {
      val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], ALT = ALT.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any], BACK_SPACE = BACK_SPACE.asInstanceOf[js.Any], CANCEL = CANCEL.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DIVIDE = DIVIDE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F10 = F10.asInstanceOf[js.Any], F11 = F11.asInstanceOf[js.Any], F12 = F12.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], F3 = F3.asInstanceOf[js.Any], F4 = F4.asInstanceOf[js.Any], F5 = F5.asInstanceOf[js.Any], F6 = F6.asInstanceOf[js.Any], F7 = F7.asInstanceOf[js.Any], F8 = F8.asInstanceOf[js.Any], F9 = F9.asInstanceOf[js.Any], HELP = HELP.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], MULTIPLY = MULTIPLY.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMPAD0 = NUMPAD0.asInstanceOf[js.Any], NUMPAD1 = NUMPAD1.asInstanceOf[js.Any], NUMPAD2 = NUMPAD2.asInstanceOf[js.Any], NUMPAD3 = NUMPAD3.asInstanceOf[js.Any], NUMPAD4 = NUMPAD4.asInstanceOf[js.Any], NUMPAD5 = NUMPAD5.asInstanceOf[js.Any], NUMPAD6 = NUMPAD6.asInstanceOf[js.Any], NUMPAD7 = NUMPAD7.asInstanceOf[js.Any], NUMPAD8 = NUMPAD8.asInstanceOf[js.Any], NUMPAD9 = NUMPAD9.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PAUSE = PAUSE.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SEMICOLON = SEMICOLON.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], SUBTRACT = SUBTRACT.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any], chord = js.Any.fromFunction1(chord))
      __obj.asInstanceOf[IKey]
    }
    
    @scala.inline
    implicit class IKeyMutableBuilder[Self <: IKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADD(value: String): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALT(value: String): Self = StObject.set(x, "ALT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_DOWN(value: String): Self = StObject.set(x, "ARROW_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_LEFT(value: String): Self = StObject.set(x, "ARROW_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_RIGHT(value: String): Self = StObject.set(x, "ARROW_RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARROW_UP(value: String): Self = StObject.set(x, "ARROW_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBACK_SPACE(value: String): Self = StObject.set(x, "BACK_SPACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCANCEL(value: String): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR(value: String): Self = StObject.set(x, "CLEAR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMMAND(value: String): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTROL(value: String): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChord(value: /* repeated */ String | IKey => String): Self = StObject.set(x, "chord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDECIMAL(value: String): Self = StObject.set(x, "DECIMAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDELETE(value: String): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDIVIDE(value: String): Self = StObject.set(x, "DIVIDE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOWN(value: String): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEND(value: String): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setENTER(value: String): Self = StObject.set(x, "ENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEQUALS(value: String): Self = StObject.set(x, "EQUALS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setESCAPE(value: String): Self = StObject.set(x, "ESCAPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF1(value: String): Self = StObject.set(x, "F1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF10(value: String): Self = StObject.set(x, "F10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF11(value: String): Self = StObject.set(x, "F11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF12(value: String): Self = StObject.set(x, "F12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF2(value: String): Self = StObject.set(x, "F2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF3(value: String): Self = StObject.set(x, "F3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF4(value: String): Self = StObject.set(x, "F4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF5(value: String): Self = StObject.set(x, "F5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF6(value: String): Self = StObject.set(x, "F6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF7(value: String): Self = StObject.set(x, "F7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF8(value: String): Self = StObject.set(x, "F8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF9(value: String): Self = StObject.set(x, "F9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHELP(value: String): Self = StObject.set(x, "HELP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINSERT(value: String): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEFT(value: String): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMETA(value: String): Self = StObject.set(x, "META", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMULTIPLY(value: String): Self = StObject.set(x, "MULTIPLY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNULL(value: String): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD0(value: String): Self = StObject.set(x, "NUMPAD0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD1(value: String): Self = StObject.set(x, "NUMPAD1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD2(value: String): Self = StObject.set(x, "NUMPAD2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD3(value: String): Self = StObject.set(x, "NUMPAD3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD4(value: String): Self = StObject.set(x, "NUMPAD4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD5(value: String): Self = StObject.set(x, "NUMPAD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD6(value: String): Self = StObject.set(x, "NUMPAD6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD7(value: String): Self = StObject.set(x, "NUMPAD7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD8(value: String): Self = StObject.set(x, "NUMPAD8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUMPAD9(value: String): Self = StObject.set(x, "NUMPAD9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPAGE_DOWN(value: String): Self = StObject.set(x, "PAGE_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPAGE_UP(value: String): Self = StObject.set(x, "PAGE_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPAUSE(value: String): Self = StObject.set(x, "PAUSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRETURN(value: String): Self = StObject.set(x, "RETURN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRIGHT(value: String): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEMICOLON(value: String): Self = StObject.set(x, "SEMICOLON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEPARATOR(value: String): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHIFT(value: String): Self = StObject.set(x, "SHIFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPACE(value: String): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUBTRACT(value: String): Self = StObject.set(x, "SUBTRACT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAB(value: String): Self = StObject.set(x, "TAB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUP(value: String): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
    }
  }
}
