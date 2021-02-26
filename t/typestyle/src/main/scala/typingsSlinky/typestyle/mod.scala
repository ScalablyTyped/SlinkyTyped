package typingsSlinky.typestyle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Record
import typingsSlinky.typestyle.anon.AutoGenerateTag
import typingsSlinky.typestyle.anon.TextContent
import typingsSlinky.typestyle.typesMod.FontFace
import typingsSlinky.typestyle.typesMod.KeyFrames
import typingsSlinky.typestyle.typesMod.MediaQuery
import typingsSlinky.typestyle.typesMod.NestedCSSProperties
import typingsSlinky.typestyle.typestyleBooleans.`false`
import typingsSlinky.typestyle.typestyleMod.StylesTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typestyle", "TypeStyle")
  @js.native
  class TypeStyle protected ()
    extends typingsSlinky.typestyle.typestyleMod.TypeStyle {
    def this(hasAutoGenerateTag: AutoGenerateTag) = this()
  }
  
  @JSImport("typestyle", "classes")
  @js.native
  def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = js.native
  
  @JSImport("typestyle", "createTypeStyle")
  @js.native
  def createTypeStyle(): typingsSlinky.typestyle.typestyleMod.TypeStyle = js.native
  @JSImport("typestyle", "createTypeStyle")
  @js.native
  def createTypeStyle(target: TextContent): typingsSlinky.typestyle.typestyleMod.TypeStyle = js.native
  
  @JSImport("typestyle", "cssRaw")
  @js.native
  def cssRaw(mustBeValidCSS: String): Unit = js.native
  
  @JSImport("typestyle", "cssRule")
  @js.native
  def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
  
  @JSImport("typestyle", "extend")
  @js.native
  def extend_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): NestedCSSProperties = js.native
  
  @JSImport("typestyle", "fontFace")
  @js.native
  def fontFace(fontFace: FontFace*): Unit = js.native
  
  @JSImport("typestyle", "forceRenderStyles")
  @js.native
  def forceRenderStyles(): Unit = js.native
  
  @JSImport("typestyle", "getStyles")
  @js.native
  def getStyles(): String = js.native
  
  @JSImport("typestyle", "keyframes")
  @js.native
  def keyframes(frames: KeyFrames): String = js.native
  
  @JSImport("typestyle", "media")
  @js.native
  def media_false(mediaQuery: MediaQuery, objects: (js.UndefOr[`false` | NestedCSSProperties | Null])*): NestedCSSProperties = js.native
  
  @JSImport("typestyle", "reinit")
  @js.native
  def reinit(): Unit = js.native
  
  @JSImport("typestyle", "setStylesTarget")
  @js.native
  def setStylesTarget(tag: StylesTarget): Unit = js.native
  
  @JSImport("typestyle", "style")
  @js.native
  def style(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = js.native
  
  @JSImport("typestyle", "stylesheet")
  @js.native
  def stylesheet[Classes /* <: Record[String, NestedCSSProperties] */](classes: Classes): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ClassName in keyof Classes ]: string}
    */ typingsSlinky.typestyle.typestyleStrings.stylesheet with TopLevel[js.Any] = js.native
}
