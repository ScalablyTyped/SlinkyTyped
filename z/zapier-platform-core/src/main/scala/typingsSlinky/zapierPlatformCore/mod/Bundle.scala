package typingsSlinky.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.zapierPlatformCore.anon.Id
import typingsSlinky.zapierPlatformCore.anon.IsFillingDynamicDropdown
import typingsSlinky.zapierPlatformCore.anon.PartialmethodHttpMethodqu
import typingsSlinky.zapierPlatformCore.anon.PartialmethodHttpMethodquContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle[InputData] extends js.Object {
  var authData: StringDictionary[String] = js.native
  var cleanedRequest: js.UndefOr[PartialmethodHttpMethodquContent | js.Any] = js.native
  var inputData: InputData = js.native
  var inputDataRaw: StringDictionary[String] = js.native
  var meta: IsFillingDynamicDropdown = js.native
  var rawRequest: js.UndefOr[PartialmethodHttpMethodqu] = js.native
  var subscribeData: js.UndefOr[Id] = js.native
  var targetUrl: js.UndefOr[String] = js.native
}

object Bundle {
  @scala.inline
  def apply[InputData](
    authData: StringDictionary[String],
    inputData: InputData,
    inputDataRaw: StringDictionary[String],
    meta: IsFillingDynamicDropdown
  ): Bundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[InputData]]
  }
  @scala.inline
  implicit class BundleOps[Self[inputdata] <: Bundle[inputdata], InputData] (val x: Self[InputData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InputData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InputData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[InputData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[InputData] with Other]
    @scala.inline
    def withAuthData(value: StringDictionary[String]): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputData(value: InputData): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDataRaw(value: StringDictionary[String]): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDataRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: IsFillingDynamicDropdown): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCleanedRequest(value: PartialmethodHttpMethodquContent | js.Any): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanedRequest: Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanedRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withRawRequest(value: PartialmethodHttpMethodqu): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawRequest: Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribeData(value: Id): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribeData: Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeData")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUrl(value: String): Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUrl: Self[InputData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrl")(js.undefined)
        ret
    }
  }
  
}

