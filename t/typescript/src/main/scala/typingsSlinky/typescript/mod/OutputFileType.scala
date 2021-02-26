package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputFileType extends StObject
@JSImport("typescript", "OutputFileType")
@js.native
object OutputFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType with Double] = js.native
  
  @js.native
  sealed trait Declaration extends OutputFileType
  /* 2 */ val Declaration: typingsSlinky.typescript.mod.OutputFileType.Declaration with Double = js.native
  
  @js.native
  sealed trait JavaScript extends OutputFileType
  /* 0 */ val JavaScript: typingsSlinky.typescript.mod.OutputFileType.JavaScript with Double = js.native
  
  @js.native
  sealed trait SourceMap extends OutputFileType
  /* 1 */ val SourceMap: typingsSlinky.typescript.mod.OutputFileType.SourceMap with Double = js.native
}
