package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedConfigCacheEntry extends js.Object {
  var extendedConfig: js.UndefOr[ParsedTsconfig] = js.native
  var extendedResult: TsConfigSourceFile = js.native
}

object ExtendedConfigCacheEntry {
  @scala.inline
  def apply(extendedResult: TsConfigSourceFile): ExtendedConfigCacheEntry = {
    val __obj = js.Dynamic.literal(extendedResult = extendedResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedConfigCacheEntry]
  }
  @scala.inline
  implicit class ExtendedConfigCacheEntryOps[Self <: ExtendedConfigCacheEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedResult(value: TsConfigSourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedConfig(value: ParsedTsconfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedConfig")(js.undefined)
        ret
    }
  }
  
}

