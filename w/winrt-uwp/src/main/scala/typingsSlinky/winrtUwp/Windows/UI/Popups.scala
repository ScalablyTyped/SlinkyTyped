package typingsSlinky.winrtUwp.Windows.UI

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for context menus and message dialogs. */
object Popups {
  
  @js.native
  sealed trait MessageDialogOptions extends StObject
  /** Specifies less frequently used options for a MessageDialog . */
  @JSGlobal("Windows.UI.Popups.MessageDialogOptions")
  @js.native
  object MessageDialogOptions extends StObject {
    
    /** Ignore user input for a short period. This enables browsers to defend against clickjacking. */
    @js.native
    sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
    
    /** No options are specified and default behavior is used. */
    @js.native
    sealed trait none extends MessageDialogOptions
  }
  
  @js.native
  sealed trait Placement extends StObject
  /** Specifies where the context menu should be positioned relative to the selection rectangle. */
  @JSGlobal("Windows.UI.Popups.Placement")
  @js.native
  object Placement extends StObject {
    
    /** Place the context menu above the selection rectangle. */
    @js.native
    sealed trait default extends Placement
    
    /** Place the context menu above the selection rectangle. */
    @js.native
    sealed trait above extends Placement
    
    /** Place the context menu below the selection rectangle. */
    @js.native
    sealed trait below extends Placement
    
    /** Place the context menu to the left of the selection rectangle. */
    @js.native
    sealed trait left extends Placement
    
    /** Place the context menu to the right of the selection rectangle. */
    @js.native
    sealed trait right extends Placement
  }
  
  /** Represents a command in a context menu or message dialog box. */
  @js.native
  trait IUICommand extends StObject {
    
    /** Gets or sets the identifier of the command. */
    var id: js.Any = js.native
    
    /** Gets or sets the handler for the event that is fired when the user invokes the command. */
    def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is fired when the user invokes the command. */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command. */
    var label: String = js.native
  }
  
  /** Represents a dialog. The dialog has a command bar that can support up to three commands. If you don't specify any commands, then a default command is added to close the dialog. */
  @js.native
  trait MessageDialog extends StObject {
    
    /** Gets or sets the index of the command you want to use as the cancel command. This is the command that fires when users press the ESC key. */
    var cancelCommandIndex: Double = js.native
    
    /** Gets an array of commands that appear in the command bar of the message dialog. These commands makes the dialog actionable. */
    var commands: IVector[IUICommand] = js.native
    
    /** Gets or sets the message to be displayed to the user. */
    var content: String = js.native
    
    /** Gets or sets the index of the command you want to use as the default. This is the command that fires by default when users press the ENTER key. */
    var defaultCommandIndex: Double = js.native
    
    /** Gets or sets the options for a MessageDialog . */
    var options: MessageDialogOptions = js.native
    
    /**
      * Begins an asynchronous operation showing a dialog.
      * @return An object that represents the asynchronous operation. For more on the async pattern, see Asynchronous programming.
      */
    def showAsync(): IPromiseWithIAsyncOperation[IUICommand] = js.native
    
    /** Gets or sets the title to display on the dialog, if any. */
    var title: String = js.native
  }
  object MessageDialog {
    
    @scala.inline
    def apply(
      cancelCommandIndex: Double,
      commands: IVector[IUICommand],
      content: String,
      defaultCommandIndex: Double,
      options: MessageDialogOptions,
      showAsync: () => IPromiseWithIAsyncOperation[IUICommand],
      title: String
    ): MessageDialog = {
      val __obj = js.Dynamic.literal(cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDialog]
    }
    
    @scala.inline
    implicit class MessageDialogMutableBuilder[Self <: MessageDialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelCommandIndex(value: Double): Self = StObject.set(x, "cancelCommandIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommands(value: IVector[IUICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCommandIndex(value: Double): Self = StObject.set(x, "defaultCommandIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: MessageDialogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAsync(value: () => IPromiseWithIAsyncOperation[IUICommand]): Self = StObject.set(x, "showAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a context menu. */
  @js.native
  trait PopupMenu extends StObject {
    
    /** Gets the commands for the context menu. */
    var commands: IVector[IUICommand] = js.native
    
    /**
      * Shows the context menu at the specified client coordinates.
      * @param invocationPoint The coordinates (in DIPs), relative to the window, of the user's finger or mouse pointer when the oncontextmenu event fired. The menu is placed above and centered on this point.
      * @return A IUICommand object that represents the context menu command that was invoked by the user, after the ShowAsync call completes.
      */
    def showAsync(invocationPoint: Point): IPromiseWithIAsyncOperation[IUICommand] = js.native
    
    /**
      * Shows the context menu above the specified selection.
      * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window. The context menu is placed directly above and centered on this rectangle such that selection is not covered.
      * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
      */
    def showForSelectionAsync(selection: Rect): IPromiseWithIAsyncOperation[IUICommand] = js.native
    /**
      * Shows the context menu in the preferred placement relative to the specified selection.
      * @param selection The coordinates (in DIPs) of the selected rectangle, relative to the window.
      * @param preferredPlacement The preferred placement of the context menu relative to the selection rectangle.
      * @return A IUICommand object that represents the context menu command invoked by the user, after the ShowForSelectionAsync call completes.
      */
    def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[IUICommand] = js.native
  }
  
  /** Represents a command in a context menu. */
  @js.native
  trait UICommand extends StObject {
    
    /** Gets or sets the identifier of the command. */
    var id: js.Any = js.native
    
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command. */
    var label: String = js.native
  }
  
  /** Represents a callback function that handles the event that is fired when the user invokes a context menu command. */
  type UICommandInvokedHandler = js.Function1[/* command */ IUICommand, Unit]
  
  /** Represents a command separator in a context menu. */
  @js.native
  trait UICommandSeparator extends StObject {
    
    /** Gets or sets the identifier of the command separator. */
    var id: js.Any = js.native
    
    /** Gets or sets the handler for the event that is fired for the command separator. */
    def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is fired for the command separator. */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command separator. */
    var label: String = js.native
  }
}
