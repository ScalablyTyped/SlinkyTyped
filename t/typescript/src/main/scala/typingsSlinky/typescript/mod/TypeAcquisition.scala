package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAcquisition
  extends /* option */ StringDictionary[js.UndefOr[js.Array[java.lang.String] | Boolean]] {
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated typingOptions.enableAutoDiscovery
    * Use typeAcquisition.enable instead.
    */
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.native
  var include: js.UndefOr[js.Array[java.lang.String]] = js.native
}

object TypeAcquisition {
  @scala.inline
  def apply(): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAcquisition]
  }
  @scala.inline
  implicit class TypeAcquisitionOps[Self <: TypeAcquisition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

