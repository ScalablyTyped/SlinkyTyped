package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Application-wide service for handling modals, overlays and dialogs By default it
  * injects the passed template url into a div to body of the document And renders it,
  * but does also support rendering items in an iframe, incase serverside processing is needed, or its a non-angular page
  */
@js.native
trait IDialogService extends js.Object {
  var dialogs: js.UndefOr[js.Array[_]] = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#close
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes a specific dialog
    * @param {Object} dialog the dialog object to close
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def close(dialog: IDialog, args: js.Any*): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#closeAll
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes all dialogs
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def closeAll(args: js.Any*): Unit = js.native
  /** Internal method that closes the dialog properly and cleans up resources */
  def closeDialog(dialog: IDialog): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#contentPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a content picker tree in a modal, the callback returns an array of selected documents
    * @param {Object} options content picker dialog options object
    * @param {Boolean} options.multipicker should the picker return one or multiple items
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def contentPicker(options: IContentPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    * @description
    * Opens a dialog to an embed dialog
    */
  def embedDialog(options: js.Any): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#iconPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a icon picker in a modal, the callback returns a object representing the selected icon
    * @param {Object} options iconpicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def iconPicker(options: IIconPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#linkPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a link picker tree in a modal, the callback returns a single link
    * @param {Object} options content picker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def linkPicker(options: ILinkPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#macroPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a mcaro picker in a modal, the callback returns a object representing the macro and it's parameters
    * @param {Object} options macropicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def macroPicker(options: IMacroPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#mediaPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a media picker in a modal, the callback returns an array of selected media items
    * @param {Object} options mediapicker dialog options object
    * @param {Boolean} options.onlyImages Only display files that have an image file-extension
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def mediaPicker(options: IMediaPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberGroupPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member group picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member group picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberGroupPicker(options: IMemberGroupPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberPicker(options: IMemberPickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#open
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a modal rendering a given template url.
    *
    * @param {Object} options rendering options
    * @param {DomElement} options.container the DOM element to inject the modal into, by default set to body
    * @param {Function} options.callback function called when the modal is submitted
    * @param {String} options.template the url of the template
    * @param {String} options.animation animation csss class, by default set to "fade"
    * @param {String} options.modalClass modal css class, by default "umb-modal"
    * @param {Bool} options.show show the modal instantly
    * @param {Bool} options.iframe load template in an iframe, only needed for serverside templates
    * @param {Int} options.width set a width on the modal, only needed for iframes
    * @param {Bool} options.inline strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container
    * @returns {Object} modal object
    */
  def open(options: IDialogRenderingOptions): IModal = js.native
  /** Internal method that handles opening all dialogs */
  def openDialog(options: IDialogRenderingOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#propertyDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog with a chosen property editor in, a value can be passed to the modal, and this value is returned in the callback
    * @param {Object} options mediapicker dialog options object
    * @param {Function} options.callback callback function
    * @param {String} editor editor to use to edit a given value and return on callback
    * @param {Object} value value sent to the property editor
    * @returns {Object} modal object
    */
  def propertyDialog(options: IPropertyDialogOptions): IModal = js.native
  /** Internal method that removes all dialogs */
  def removeAllDialogs(args: js.Any*): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#treePicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a tree picker in a modal, the callback returns a object representing the selected tree item
    * @param {Object} options iconpicker dialog options object
    * @param {String} options.section tree section to display
    * @param {String} options.treeAlias specific tree to display
    * @param {Boolean} options.multiPicker should the tree pick one or multiple items before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def treePicker(options: ITreePickerOptions): IModal = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog to show a custom YSOD
    */
  def ysodDialog(ysodError: js.Any): Unit = js.native
}

object IDialogService {
  @scala.inline
  def apply(
    close: (IDialog, /* repeated */ js.Any) => Unit,
    closeAll: /* repeated */ js.Any => Unit,
    closeDialog: IDialog => Unit,
    contentPicker: IContentPickerOptions => IModal,
    embedDialog: js.Any => Unit,
    iconPicker: IIconPickerOptions => IModal,
    linkPicker: ILinkPickerOptions => IModal,
    macroPicker: IMacroPickerOptions => IModal,
    mediaPicker: IMediaPickerOptions => IModal,
    memberGroupPicker: IMemberGroupPickerOptions => IModal,
    memberPicker: IMemberPickerOptions => IModal,
    open: IDialogRenderingOptions => IModal,
    openDialog: IDialogRenderingOptions => IModal,
    propertyDialog: IPropertyDialogOptions => IModal,
    removeAllDialogs: /* repeated */ js.Any => Unit,
    treePicker: ITreePickerOptions => IModal,
    ysodDialog: js.Any => Unit
  ): IDialogService = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), closeAll = js.Any.fromFunction1(closeAll), closeDialog = js.Any.fromFunction1(closeDialog), contentPicker = js.Any.fromFunction1(contentPicker), embedDialog = js.Any.fromFunction1(embedDialog), iconPicker = js.Any.fromFunction1(iconPicker), linkPicker = js.Any.fromFunction1(linkPicker), macroPicker = js.Any.fromFunction1(macroPicker), mediaPicker = js.Any.fromFunction1(mediaPicker), memberGroupPicker = js.Any.fromFunction1(memberGroupPicker), memberPicker = js.Any.fromFunction1(memberPicker), open = js.Any.fromFunction1(open), openDialog = js.Any.fromFunction1(openDialog), propertyDialog = js.Any.fromFunction1(propertyDialog), removeAllDialogs = js.Any.fromFunction1(removeAllDialogs), treePicker = js.Any.fromFunction1(treePicker), ysodDialog = js.Any.fromFunction1(ysodDialog))
    __obj.asInstanceOf[IDialogService]
  }
  @scala.inline
  implicit class IDialogServiceOps[Self <: IDialogService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: (IDialog, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCloseAll(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseDialog(value: IDialog => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentPicker(value: IContentPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmbedDialog(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIconPicker(value: IIconPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinkPicker(value: ILinkPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMacroPicker(value: IMacroPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macroPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMediaPicker(value: IMediaPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMemberGroupPicker(value: IMemberGroupPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberGroupPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMemberPicker(value: IMemberPickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberPicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: IDialogRenderingOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenDialog(value: IDialogRenderingOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPropertyDialog(value: IPropertyDialogOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAllDialogs(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllDialogs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTreePicker(value: ITreePickerOptions => IModal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treePicker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYsodDialog(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ysodDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDialogs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogs")(js.undefined)
        ret
    }
  }
  
}

