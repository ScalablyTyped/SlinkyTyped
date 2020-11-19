package typingsSlinky.webpackSources.mod

import typingsSlinky.sourceListMap.mod.SourceListMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-sources", "RawSource")
@js.native
class RawSource protected () extends Source {
  def this(value: String) = this()
  
  def listMap(options: MapOptions): SourceListMap = js.native
}
