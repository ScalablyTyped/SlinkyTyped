package typingsSlinky.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Key extends js.Object

//#region Enumerations
/**
  * Defines a set of keyboard values.
  **/
@JSGlobal("WinJS.Utilities.Key")
@js.native
object Key extends js.Object {
  /**
    * The F1 key.
    **/
  @js.native
  sealed trait F1 extends Key
  
  /**
    * The F10 key.
    **/
  @js.native
  sealed trait F10 extends Key
  
  /**
    * The F11 key.
    **/
  @js.native
  sealed trait F11 extends Key
  
  /**
    * The F12 key.
    **/
  @js.native
  sealed trait F12 extends Key
  
  /**
    * The F2 key.
    **/
  @js.native
  sealed trait F2 extends Key
  
  /**
    * The F3 key.
    **/
  @js.native
  sealed trait F3 extends Key
  
  /**
    * The F4 key.
    **/
  @js.native
  sealed trait F4 extends Key
  
  /**
    * The F5 key.
    **/
  @js.native
  sealed trait F5 extends Key
  
  /**
    * The F6 key.
    **/
  @js.native
  sealed trait F6 extends Key
  
  /**
    * The F7 key.
    **/
  @js.native
  sealed trait F7 extends Key
  
  /**
    * The F8 key.
    **/
  @js.native
  sealed trait F8 extends Key
  
  /**
    * The F9 key.
    **/
  @js.native
  sealed trait F9 extends Key
  
  /**
    * The open bracket key ([).
    **/
  /**
    * The XBox One gamepad A button.
    **/
  @js.native
  sealed trait GamepadA extends Key
  
  /**
    * The XBox One gamepad B button.
    **/
  @js.native
  sealed trait GamepadB extends Key
  
  /**
    * The XBox One gamepad dpad down.
    **/
  @js.native
  sealed trait GamepadDPadDown extends Key
  
  /**
    * The XBox One gamepad dpad left.
    **/
  @js.native
  sealed trait GamepadDPadLeft extends Key
  
  /**
    * The XBox One gamepad dpad right.
    **/
  @js.native
  sealed trait GamepadDPadRight extends Key
  
  /**
    * The XBox One gamepad dpad up.
    **/
  @js.native
  sealed trait GamepadDPadUp extends Key
  
  /**
    * The XBox One gamepad left shoulder.
    **/
  @js.native
  sealed trait GamepadLeftShoulder extends Key
  
  /**
    * The XBox One gamepad left thumbstick button.
    **/
  @js.native
  sealed trait GamepadLeftThumbstick extends Key
  
  /**
    * The XBox One gamepad left thumbstick's down.
    **/
  @js.native
  sealed trait GamepadLeftThumbstickDown extends Key
  
  /**
    * The XBox One gamepad left thumbstick's left.
    **/
  @js.native
  sealed trait GamepadLeftThumbstickLeft extends Key
  
  /**
    * The XBox One gamepad left thumbstick's right.
    **/
  @js.native
  sealed trait GamepadLeftThumbstickRight extends Key
  
  /**
    * The XBox One gamepad left thumbstick's up.
    **/
  @js.native
  sealed trait GamepadLeftThumbstickUp extends Key
  
  /**
    * The XBox One gamepad left trigger.
    **/
  @js.native
  sealed trait GamepadLeftTrigger extends Key
  
  /**
    * The XBox One gamepad menu button.
    **/
  @js.native
  sealed trait GamepadMenu extends Key
  
  /**
    * The XBox One gamepad right shoulder.
    **/
  @js.native
  sealed trait GamepadRightShoulder extends Key
  
  /**
    * The XBox One gamepad right thumbstick button.
    **/
  @js.native
  sealed trait GamepadRightThumbstick extends Key
  
  /**
    * The XBox One gamepad right thumbstick's down.
    **/
  @js.native
  sealed trait GamepadRightThumbstickDown extends Key
  
  /**
    * The XBox One gamepad right thumbstick's left.
    **/
  @js.native
  sealed trait GamepadRightThumbstickLeft extends Key
  
  /**
    * The XBox One gamepad right thumbstick's right.
    **/
  @js.native
  sealed trait GamepadRightThumbstickRight extends Key
  
  /**
    * The XBox One gamepad right thumbstick's up.
    **/
  @js.native
  sealed trait GamepadRightThumbstickUp extends Key
  
  /**
    * The XBox One gamepad right trigger.
    **/
  @js.native
  sealed trait GamepadRightTrigger extends Key
  
  /**
    * The XBox One gamepad view button.
    **/
  @js.native
  sealed trait GamepadView extends Key
  
  /**
    * The XBox One gamepad X button.
    **/
  @js.native
  sealed trait GamepadX extends Key
  
  /**
    * The XBox One gamepad Y button.
    **/
  @js.native
  sealed trait GamepadY extends Key
  
  /**
    * Any IME input.
    **/
  @js.native
  sealed trait IME extends Key
  
  /**
    * The XBox One Remote navigation accept button.
    **/
  @js.native
  sealed trait NavigationAccept extends Key
  
  /**
    * The XBox One Remote navigation cancel button.
    **/
  @js.native
  sealed trait NavigationCancel extends Key
  
  /**
    * The XBox One Remote navigation down button.
    **/
  @js.native
  sealed trait NavigationDown extends Key
  
  /**
    * The XBox One Remote navigation left button.
    **/
  @js.native
  sealed trait NavigationLeft extends Key
  
  /**
    * The XBox One Remote navigation menu button.
    **/
  @js.native
  sealed trait NavigationMenu extends Key
  
  /**
    * The XBox One Remote navigation right button.
    **/
  @js.native
  sealed trait NavigationRight extends Key
  
  /**
    * The XBox One Remote navigation up button.
    **/
  @js.native
  sealed trait NavigationUp extends Key
  
  /**
    * The XBox One Remote navigation view button.
    **/
  @js.native
  sealed trait NavigationView extends Key
  
  /**
    * The a key.
    **/
  @js.native
  sealed trait a extends Key
  
  /**
    * The addition key (+).
    **/
  @js.native
  sealed trait add extends Key
  
  /**
    * The ALT key.
    **/
  @js.native
  sealed trait alt extends Key
  
  /**
    * The b key.
    **/
  @js.native
  sealed trait b extends Key
  
  /**
    * The backslash key (\).
    **/
  @js.native
  sealed trait backSlash extends Key
  
  /**
    * The BACKSPACE key.
    **/
  @js.native
  sealed trait backspace extends Key
  
  /**
    * The browser BACK key.
    **/
  @js.native
  sealed trait browserBack extends Key
  
  /**
    * The browser FORWARD key.
    **/
  @js.native
  sealed trait browserForward extends Key
  
  /**
    * The c key.
    **/
  @js.native
  sealed trait c extends Key
  
  /**
    * The CAPS LOCK key.
    **/
  @js.native
  sealed trait capsLock extends Key
  
  /**
    * The close bracket key (]).
    **/
  @js.native
  sealed trait closeBracket extends Key
  
  /**
    * The comma key (,).
    **/
  @js.native
  sealed trait comma extends Key
  
  /**
    * The CTRL key.
    **/
  @js.native
  sealed trait ctrl extends Key
  
  /**
    * The d key.
    **/
  @js.native
  sealed trait d extends Key
  
  /**
    * The dash key (-).
    **/
  @js.native
  sealed trait dash extends Key
  
  /**
    * The decimal point key (.)
    **/
  @js.native
  sealed trait decimalPoint extends Key
  
  /**
    * The DELETE key.
    **/
  @js.native
  sealed trait deleteKey extends Key
  
  /**
    * The division key (/).
    **/
  @js.native
  sealed trait divide extends Key
  
  /**
    * The DOWN ARROW key.
    **/
  @js.native
  sealed trait downArrow extends Key
  
  /**
    * The e key.
    **/
  @js.native
  sealed trait e extends Key
  
  /**
    * The END key.
    **/
  @js.native
  sealed trait end extends Key
  
  /**
    * The ENTER key.
    **/
  @js.native
  sealed trait enter extends Key
  
  /**
    * The equals key (=).
    **/
  @js.native
  sealed trait equal extends Key
  
  /**
    * The ESCAPE key.
    **/
  @js.native
  sealed trait escape extends Key
  
  /**
    * The f key.
    **/
  @js.native
  sealed trait f extends Key
  
  /**
    * The forward slash key (/).
    **/
  @js.native
  sealed trait forwardSlash extends Key
  
  /**
    * The g key.
    **/
  @js.native
  sealed trait g extends Key
  
  /**
    * The grave accent key (`).
    **/
  @js.native
  sealed trait graveAccent extends Key
  
  /**
    * The h key.
    **/
  @js.native
  sealed trait h extends Key
  
  /**
    * The HOME key.
    **/
  @js.native
  sealed trait home extends Key
  
  /**
    * The i key.
    **/
  @js.native
  sealed trait i extends Key
  
  /**
    * The INSERT key.
    **/
  @js.native
  sealed trait insert extends Key
  
  /**
    * The j key.
    **/
  @js.native
  sealed trait j extends Key
  
  /**
    * The k key.
    **/
  @js.native
  sealed trait k extends Key
  
  /**
    * The l key.
    **/
  @js.native
  sealed trait l extends Key
  
  /**
    * The LEFT ARROW key.
    **/
  @js.native
  sealed trait leftArrow extends Key
  
  /**
    * The left Windows key.
    **/
  @js.native
  sealed trait leftWindows extends Key
  
  /**
    * The m key.
    **/
  @js.native
  sealed trait m extends Key
  
  /**
    * The menu key.
    **/
  @js.native
  sealed trait menu extends Key
  
  /**
    * The multiplication key (*).
    **/
  @js.native
  sealed trait multiply extends Key
  
  /**
    * The n key.
    **/
  @js.native
  sealed trait n extends Key
  
  /**
    * The 0 key.
    **/
  @js.native
  sealed trait num0 extends Key
  
  /**
    * The 1 key.
    **/
  @js.native
  sealed trait num1 extends Key
  
  /**
    * The 2 key.
    **/
  @js.native
  sealed trait num2 extends Key
  
  /**
    * The 3 key.
    **/
  @js.native
  sealed trait num3 extends Key
  
  /**
    * The 4 key.
    **/
  @js.native
  sealed trait num4 extends Key
  
  /**
    * The 5 key.
    **/
  @js.native
  sealed trait num5 extends Key
  
  /**
    * The 6 key.
    **/
  @js.native
  sealed trait num6 extends Key
  
  /**
    * The 7 key.
    **/
  @js.native
  sealed trait num7 extends Key
  
  /**
    * The 8 key.
    **/
  @js.native
  sealed trait num8 extends Key
  
  /**
    * The 9 key.
    **/
  @js.native
  sealed trait num9 extends Key
  
  /**
    * The NUMBER LOCK key.
    **/
  @js.native
  sealed trait numLock extends Key
  
  /**
    * The 0 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad0 extends Key
  
  /**
    * The 1 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad1 extends Key
  
  /**
    * The 2 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad2 extends Key
  
  /**
    * The 3 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad3 extends Key
  
  /**
    * The 4 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad4 extends Key
  
  /**
    * The 5 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad5 extends Key
  
  /**
    * The 6 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad6 extends Key
  
  /**
    * The 7 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad7 extends Key
  
  /**
    * The 8 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad8 extends Key
  
  /**
    * The 9 key on the numerical keypad.
    **/
  @js.native
  sealed trait numPad9 extends Key
  
  /**
    * The o key.
    **/
  @js.native
  sealed trait o extends Key
  
  /**
    * The open bracket key ([).
    **/
  @js.native
  sealed trait openBracket extends Key
  
  /**
    * The p key.
    **/
  @js.native
  sealed trait p extends Key
  
  /**
    * The PAGE DOWN key.
    **/
  @js.native
  sealed trait pageDown extends Key
  
  /**
    * The PAGE UP key.
    **/
  @js.native
  sealed trait pageUp extends Key
  
  /**
    * The PAUSE key.
    **/
  @js.native
  sealed trait pause extends Key
  
  /**
    * The period key (.).
    **/
  @js.native
  sealed trait period extends Key
  
  /**
    * The q key.
    **/
  @js.native
  sealed trait q extends Key
  
  /**
    * The r key.
    **/
  @js.native
  sealed trait r extends Key
  
  /**
    * The RIGHT ARROW key.
    **/
  @js.native
  sealed trait rightArrow extends Key
  
  /**
    * The right Windows key.
    **/
  @js.native
  sealed trait rightWindows extends Key
  
  /**
    * The s key.
    **/
  @js.native
  sealed trait s extends Key
  
  /**
    * The SCROLL LOCK key.
    **/
  @js.native
  sealed trait scrollLock extends Key
  
  /**
    * The semicolon key (;).
    **/
  @js.native
  sealed trait semicolon extends Key
  
  /**
    * The SHIFT key.
    **/
  @js.native
  sealed trait shift extends Key
  
  /**
    * The single quote key (').
    **/
  @js.native
  sealed trait singleQuote extends Key
  
  /**
    * The SPACE key.
    **/
  @js.native
  sealed trait space extends Key
  
  /**
    * The subtraction key (-).
    **/
  @js.native
  sealed trait subtract extends Key
  
  /**
    * The t key.
    **/
  @js.native
  sealed trait t extends Key
  
  /**
    * The TAB key.
    **/
  @js.native
  sealed trait tab extends Key
  
  /**
    * The u key.
    **/
  @js.native
  sealed trait u extends Key
  
  /**
    * The UP ARROW key.
    **/
  @js.native
  sealed trait upArrow extends Key
  
  /**
    * The v key.
    **/
  @js.native
  sealed trait v extends Key
  
  /**
    * The w key.
    **/
  @js.native
  sealed trait w extends Key
  
  /**
    * The x key.
    **/
  @js.native
  sealed trait x extends Key
  
  /**
    * The y key.
    **/
  @js.native
  sealed trait y extends Key
  
  /**
    * The z key.
    **/
  @js.native
  sealed trait z extends Key
  
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
  def apply(value: Double): js.UndefOr[Key with Double] = js.native
}

