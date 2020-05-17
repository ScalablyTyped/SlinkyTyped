package typingsSlinky.typedRestClient.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typedRestClient.anon.ArrayFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestQueryParams extends js.Object {
  var options: js.UndefOr[ArrayFormat] = js.native
  var params: StringDictionary[String | Double | (js.Array[String | Double])] = js.native
}

object IRequestQueryParams {
  @scala.inline
  def apply(params: StringDictionary[String | Double | (js.Array[String | Double])]): IRequestQueryParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestQueryParams]
  }
  @scala.inline
  implicit class IRequestQueryParamsOps[Self <: IRequestQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ArrayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

