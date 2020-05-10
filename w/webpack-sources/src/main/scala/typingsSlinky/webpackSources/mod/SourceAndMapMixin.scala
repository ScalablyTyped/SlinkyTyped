package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.webpackSources.AnonColumns
import typingsSlinky.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAndMapMixin extends js.Object {
  def map(options: AnonColumns): RawSourceMap = js.native
  def sourceAndMap(options: AnonColumns): AnonMap = js.native
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: AnonColumns => RawSourceMap, sourceAndMap: AnonColumns => AnonMap): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), sourceAndMap = js.Any.fromFunction1(sourceAndMap))
    __obj.asInstanceOf[SourceAndMapMixin]
  }
  @scala.inline
  implicit class SourceAndMapMixinOps[Self <: SourceAndMapMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: AnonColumns => RawSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceAndMap(value: AnonColumns => AnonMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndMap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

