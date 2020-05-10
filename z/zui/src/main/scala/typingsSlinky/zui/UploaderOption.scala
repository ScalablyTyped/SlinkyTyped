package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uploader
  */
@js.native
trait UploaderOption extends js.Object {
  var autoUpload: js.UndefOr[Boolean] = js.native
  var browseByClickList: js.UndefOr[Boolean] = js.native
  var browse_button: js.UndefOr[String] = js.native
  var chunk_size: js.UndefOr[String] = js.native
  var deleteActionOnDone: js.UndefOr[Boolean] = js.native
  var deleteConfirm: js.UndefOr[Boolean | String] = js.native
  var dropPlaceholder: js.UndefOr[Boolean] = js.native
  var drop_element: js.UndefOr[String] = js.native
  var fileFormater: js.UndefOr[js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, Unit]] = js.native
  var fileIconCreator: js.UndefOr[
    js.Function3[/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader, Unit]
  ] = js.native
  var fileList: js.UndefOr[String] = js.native
  var fileTemplate: js.UndefOr[String] = js.native
  var file_data_name: js.UndefOr[String] = js.native
  var filters: js.UndefOr[AnonMaxfilesize] = js.native
  var flash_swf_url: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var lang: js.UndefOr[String] = js.native
  var limitFilesCount: js.UndefOr[Boolean | Double] = js.native
  var max_retries: js.UndefOr[Double] = js.native
  var multi_selection: js.UndefOr[Boolean] = js.native
  var multipart: js.UndefOr[Boolean] = js.native
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.native
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  var onChunkUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ AnonError, Unit]] = js.native
  var onFileUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.native
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], Unit]] = js.native
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onQueueChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, Unit]] = js.native
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.native
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.native
  var previewImageIcon: js.UndefOr[Boolean] = js.native
  var previewImageSize: js.UndefOr[AnonHeight] = js.native
  var qiniu: js.UndefOr[js.Object] = js.native
  var removeUploaded: js.UndefOr[Boolean] = js.native
  var rename: js.UndefOr[Boolean] = js.native
  var renameActionOnDone: js.UndefOr[Boolean] = js.native
  var renameByClick: js.UndefOr[Boolean] = js.native
  var renameExtension: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[AnonCrop] = js.native
  var responseHandler: js.UndefOr[Boolean | CallBack] = js.native
  var runtimes: js.UndefOr[String] = js.native
  var sendFileId: js.UndefOr[Boolean] = js.native
  var sendFileName: js.UndefOr[Boolean] = js.native
  var silverlight_xap_url: js.UndefOr[String] = js.native
  var staticFiles: js.UndefOr[js.Array[AnonId]] = js.native
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, Unit]
  ] = js.native
  var unique_names: js.UndefOr[Boolean] = js.native
  var uploadedMessage: js.UndefOr[Boolean] = js.native
  var url: String = js.native
}

object UploaderOption {
  @scala.inline
  def apply(url: String): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderOption]
  }
  @scala.inline
  implicit class UploaderOptionOps[Self <: UploaderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowseByClickList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseByClickList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowseByClickList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browseByClickList")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowse_button(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browse_button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowse_button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browse_button")(js.undefined)
        ret
    }
    @scala.inline
    def withChunk_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunk_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk_size")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteActionOnDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteActionOnDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteActionOnDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteActionOnDone")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteConfirm(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withDropPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop_element(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop_element: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop_element")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFormater(value: (/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormater")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFileFormater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormater")(js.undefined)
        ret
    }
    @scala.inline
    def withFileIconCreator(value: (/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIconCreator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFileIconCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileIconCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withFileList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_data_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_data_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_data_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_data_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: AnonMaxfilesize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash_swf_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_swf_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash_swf_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash_swf_url")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitFilesCount(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitFilesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitFilesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitFilesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_retries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_retries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti_selection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti_selection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi_selection")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipart_paramsFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart_params")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMultipart_params(value: js.Object | CallBack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart_params")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUpload(value: /* file */ FileObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChunkUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChunkUploaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChunkUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChunkUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ AnonError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileUploaded(value: (/* file */ FileObj, /* responseObject */ ResponseObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileUploaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFileUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilesAdded(value: /* fiels */ js.Array[FileObj] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilesAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilesAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilesAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilesRemoved(value: /* files */ js.Array[FileObj] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilesRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilesRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilesRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQueueChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueueChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnQueueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChanged(value: /* status */ STATUS => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadComplete(value: /* files */ js.Array[FileObj] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadFile(value: /* file */ FileObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadProgress(value: /* file */ FileObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewImageIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewImageSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQiniu(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qiniu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQiniu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qiniu")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUploaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameActionOnDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameActionOnDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameActionOnDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameActionOnDone")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameByClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameByClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: AnonCrop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseHandlerFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponseHandler(value: Boolean | CallBack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimes")(js.undefined)
        ret
    }
    @scala.inline
    def withSendFileId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFileId")(js.undefined)
        ret
    }
    @scala.inline
    def withSendFileName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSilverlight_xap_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silverlight_xap_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilverlight_xap_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silverlight_xap_url")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticFiles(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCreator(value: (/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCreator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStatusCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique_names(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_names")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadedMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedMessage")(js.undefined)
        ret
    }
  }
  
}

