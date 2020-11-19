package typingsSlinky.winrtUwp.global.Windows.UI

import typingsSlinky.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for context menus and message dialogs. */
@JSGlobal("Windows.UI.Popups")
@js.native
object Popups extends js.Object {
  
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
  @js.native
  class MessageDialog protected ()
    extends typingsSlinky.winrtUwp.Windows.UI.Popups.MessageDialog {
    /**
      * Initializes a new instance of the MessageDialog class to display an untitled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      */
    def this(content: String) = this()
    /**
      * Initializes a new instance of the MessageDialog class to display a titled message dialog that can be used to ask your user simple questions.
      * @param content The message displayed to the user.
      * @param title The title you want displayed on the dialog.
      */
    def this(content: String, title: String) = this()
  }
  
  /** Specifies less frequently used options for a MessageDialog . */
  @js.native
  object MessageDialogOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Popups.MessageDialogOptions with Double] = js.native
    
    /* 1 */ val acceptUserInputAfterDelay: typingsSlinky.winrtUwp.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.UI.Popups.MessageDialogOptions.none with Double = js.native
  }
  
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @js.native
  object Placement extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Popups.Placement with Double] = js.native
    
    /* 1 */ val above: typingsSlinky.winrtUwp.Windows.UI.Popups.Placement.above with Double = js.native
    
    /* 2 */ val below: typingsSlinky.winrtUwp.Windows.UI.Popups.Placement.below with Double = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.UI.Popups.Placement.default with Double = js.native
    
    /* 3 */ val left: typingsSlinky.winrtUwp.Windows.UI.Popups.Placement.left with Double = js.native
    
    /* 4 */ val right: typingsSlinky.winrtUwp.Windows.UI.Popups.Placement.right with Double = js.native
  }
  
  /** Represents a context menu. */
  @js.native
  /** Creates a new instance of the PopupMenu class. */
  class PopupMenu ()
    extends typingsSlinky.winrtUwp.Windows.UI.Popups.PopupMenu
  
  /** Represents a command in a context menu. */
  @js.native
  /** Creates a new instance of the UICommand class. */
  class UICommand ()
    extends typingsSlinky.winrtUwp.Windows.UI.Popups.UICommand {
    /**
      * Creates a new instance of the UICommand class using the specified label.
      * @param label The label for the UICommand .
      */
    def this(label: String) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label and event handler.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler) = this()
    /**
      * Creates a new instance of the UICommand class using the specified label, event handler, and command identifier.
      * @param label The label for the new command.
      * @param action The event handler for the new command.
      * @param commandId The command identifier for the new command.
      */
    def this(label: String, action: UICommandInvokedHandler, commandId: js.Any) = this()
  }
  
  /** Represents a command separator in a context menu. */
  @js.native
  /** Creates a new instance of the UICommandSeparator class. */
  class UICommandSeparator ()
    extends typingsSlinky.winrtUwp.Windows.UI.Popups.UICommandSeparator
}
