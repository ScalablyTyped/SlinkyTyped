package typingsSlinky.tensorflowTfjsCore.typesMod

import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends js.Object {
  /**
    * A function used to override the `window.fetch` function.
    */
  var fetchFunc: js.UndefOr[js.Function] = js.native
  /**
    * Whether the module or model is to be loaded from TF Hub.
    *
    * Setting this to `true` allows passing a TF-Hub module URL, omitting the
    * standard model file name and the query parameters.
    *
    * Default: `false`.
    */
  var fromTFHub: js.UndefOr[Boolean] = js.native
  /**
    * Progress callback.
    */
  var onProgress: js.UndefOr[OnProgressCallback] = js.native
  /**
    * RequestInit (options) for HTTP requests.
    *
    * For detailed information on the supported fields, see
    * [https://developer.mozilla.org/en-US/docs/Web/API/Request/Request](
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request)
    */
  var requestInit: js.UndefOr[RequestInit] = js.native
  /**
    * Strict loading model: whether extraneous weights or missing
    * weights should trigger an `Error`.
    *
    * If `true`, require that the provided weights exactly match those
    * required by the layers. `false` means that both extra weights
    * and missing weights will be silently ignored.
    *
    * Default: `true`.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Path prefix for weight files, by default this is calculated from the
    * path of the model JSON file.
    *
    * For instance, if the path to the model JSON file is
    * `http://localhost/foo/model.json`, then the default path prefix will be
    * `http://localhost/foo/`. If a weight file has the path value
    * `group1-shard1of2` in the weight manifest, then the weight file will be
    * loaded from `http://localhost/foo/group1-shard1of2` by default. However,
    * if you provide a `weightPathPrefix` value of
    * `http://localhost/foo/alt-weights`, then the weight file will be loaded
    * from the path `http://localhost/foo/alt-weights/group1-shard1of2` instead.
    */
  var weightPathPrefix: js.UndefOr[String] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchFunc(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withFromTFHub(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTFHub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromTFHub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTFHub")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* fraction */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInit(value: RequestInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightPathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightPathPrefix")(js.undefined)
        ret
    }
  }
  
}

