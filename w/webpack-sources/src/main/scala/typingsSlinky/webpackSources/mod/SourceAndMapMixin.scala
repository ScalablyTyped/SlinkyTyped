package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.webpackSources.anon.Columns
import typingsSlinky.webpackSources.anon.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAndMapMixin extends js.Object {
  def map(options: Columns): RawSourceMap = js.native
  def sourceAndMap(options: Columns): Map = js.native
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: Columns => RawSourceMap, sourceAndMap: Columns => Map): SourceAndMapMixin = {
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
    def withMap(value: Columns => RawSourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSourceAndMap(value: Columns => Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndMap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

