package typingsSlinky.typestyle

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.typestyle.typesMod.FontFace
import typingsSlinky.typestyle.typesMod.KeyFrames
import typingsSlinky.typestyle.typesMod.MediaQuery
import typingsSlinky.typestyle.typesMod.NestedCSSProperties
import typingsSlinky.typestyle.typestyleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TypeStyle protected ()
    extends typingsSlinky.typestyle.typestyleMod.TypeStyle {
    def this(hasAutoGenerateTag: AnonAutoGenerateTag) = this()
  }
  
  @JSName("classes")
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  def createTypeStyle(): typingsSlinky.typestyle.typestyleMod.TypeStyle = js.native
  def createTypeStyle(target: AnonTextContent): typingsSlinky.typestyle.typestyleMod.TypeStyle = js.native
  def cssRaw(mustBeValidCSS: String): Unit = js.native
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
  @JSName("extend")
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = js.native
  def fontFace(fontFace: FontFace*): Unit = js.native
  def forceRenderStyles(): Unit = js.native
  def getStyles(): String = js.native
  def keyframes(frames: KeyFrames): String = js.native
  @JSName("media")
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = js.native
  def reinit(): Unit = js.native
  def setStylesTarget(tag: AnonTextContent): Unit = js.native
  def stylesheet[Names /* <: String */](classes: Record[Names, NestedCSSProperties]): Record[Names, String] = js.native
  @js.native
  object style extends js.Object {
    def apply(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = js.native
  }
  
}

