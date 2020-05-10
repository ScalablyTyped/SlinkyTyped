package typingsSlinky.tusJsClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var endpoint: String = js.native
  var fingerprint: js.UndefOr[js.Function2[/* file */ File, /* options */ js.UndefOr[UploadOptions], String]] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  var onChunkComplete: js.UndefOr[
    (js.Function3[/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double, Unit]) | Null
  ] = js.native
  var onError: js.UndefOr[(js.Function1[/* error */ js.Error, Unit]) | Null] = js.native
  var onProgress: js.UndefOr[(js.Function2[/* bytesSent */ Double, /* bytesTotal */ Double, Unit]) | Null] = js.native
  var onSuccess: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var overridePatchMethod: js.UndefOr[Boolean] = js.native
  var removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.native
  var resume: js.UndefOr[Boolean] = js.native
  var retryDelays: js.UndefOr[js.Array[Double]] = js.native
  var uploadLengthDeferred: js.UndefOr[Boolean] = js.native
  var uploadSize: js.UndefOr[Double | Null] = js.native
  var uploadUrl: js.UndefOr[String | Null] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object UploadOptions {
  @scala.inline
  def apply(endpoint: String): UploadOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
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
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChunkComplete(value: (/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChunkComplete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChunkComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChunkComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChunkCompleteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChunkComplete")(null)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self = {
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
    def withOnErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(null)
        ret
    }
    @scala.inline
    def withOnProgress(value: (/* bytesSent */ Double, /* bytesTotal */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(null)
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccessNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(null)
        ret
    }
    @scala.inline
    def withOverridePatchMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePatchMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverridePatchMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePatchMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFingerprintOnSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFingerprintOnSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFingerprintOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFingerprintOnSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelays(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelays")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLengthDeferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLengthDeferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLengthDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLengthDeferred")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSize")(null)
        ret
    }
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(null)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

