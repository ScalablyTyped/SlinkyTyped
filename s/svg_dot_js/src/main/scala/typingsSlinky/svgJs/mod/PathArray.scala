package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathArray extends Array {
  
  def bbox(): BBox = js.native
  
  def move(x: Double, y: Double): this.type = js.native
  
  @JSName("parse")
  def parse_Array(array: PathArrayAlias): js.Array[PathArrayPoint] = js.native
  
  def size(): this.type = js.native
  def size(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def size(width: Double): this.type = js.native
  def size(width: Double, height: Double): this.type = js.native
}
