package typingsSlinky.tabris.mod

import typingsSlinky.tabris.Anon1
import typingsSlinky.tabris.AnonCancel
import typingsSlinky.tabris.OmitAlertDialogset
import typingsSlinky.tabris.tabrisStrings.buttons
import typingsSlinky.tabris.tabrisStrings.message
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "AlertDialog")
@js.native
class AlertDialog () extends Popup {
  def this(properties: Properties[AlertDialog, OmitAlertDialogset]) = this()
  /**
    * An object with the texts of the buttons to display. There are up to three buttons: `ok`, `cancel` and
    * `neutral`. If no text is given for a button it will not be displayed. Example: `{ok: 'Yes', cancel:
    * 'No'}` shows 'Yes' and 'No', but no 'neutral' button.
    */
  var buttons: AnonCancel = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_AlertDialog: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with Anon1 = js.native
  /**
    * The message to display inside the dialog.
    */
  var message: String = js.native
  /**
    * Fired when the [*buttons*](#buttons) property has changed.
    */
  var onButtonsChanged: ChangeListeners[this.type, buttons] = js.native
  /**
    * Fired when the dialog was closed for any reason.
    */
  var onClose: Listeners[AlertDialogCloseEvent[this.type]] = js.native
  /**
    * Fired when the dialog was closed by pressing the 'cancel' button.
    */
  var onCloseCancel: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the dialog was closed by pressing the 'neutral' button.
    */
  var onCloseNeutral: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the dialog was closed by pressing the 'ok' button.
    */
  var onCloseOk: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  /**
    * A composite that may contain `TextInput` widgets to be displayed alongside the `title` and `message`.
    * The text values inserted by the user can be read in the dialogs `close` event via its `texts`
    * property. Eg.: `dialog.on('close', (e) => e.texts[0])`
    * In an AlertDialog JSX element the TextInput widgets may be given as child elements.
    * @constant
    */
  val textInputs: ContentView_[TextInput] = js.native
  /**
    * The title of the dialog.
    */
  var title: String = js.native
}

/* static members */
@JSImport("tabris", "AlertDialog")
@js.native
object AlertDialog extends js.Object {
  /**
    * Makes the given alert dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual AlertDialog.
    * @param alertDialog The alert dialog to open
    */
  def open(alertDialog: AlertDialog): AlertDialog = js.native
  /**
    * Creates and opens an alert dialog with one 'OK' button and the given message.
    * @param message The message to display
    */
  def open(message: String): AlertDialog = js.native
}

