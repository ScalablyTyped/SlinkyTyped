package typingsSlinky.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictAll extends StObject
@JSImport("xelib", "ConflictAll")
@js.native
object ConflictAll extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictAll with Double] = js.native
  
  @js.native
  sealed trait caConflict extends ConflictAll
  /* 5 */ val caConflict: typingsSlinky.xelib.mod.ConflictAll.caConflict with Double = js.native
  
  @js.native
  sealed trait caConflictBenign extends ConflictAll
  /* 3 */ val caConflictBenign: typingsSlinky.xelib.mod.ConflictAll.caConflictBenign with Double = js.native
  
  @js.native
  sealed trait caConflictCritical extends ConflictAll
  /* 6 */ val caConflictCritical: typingsSlinky.xelib.mod.ConflictAll.caConflictCritical with Double = js.native
  
  @js.native
  sealed trait caNoConflict extends ConflictAll
  /* 2 */ val caNoConflict: typingsSlinky.xelib.mod.ConflictAll.caNoConflict with Double = js.native
  
  @js.native
  sealed trait caOnlyOne extends ConflictAll
  /* 1 */ val caOnlyOne: typingsSlinky.xelib.mod.ConflictAll.caOnlyOne with Double = js.native
  
  @js.native
  sealed trait caOverride extends ConflictAll
  /* 4 */ val caOverride: typingsSlinky.xelib.mod.ConflictAll.caOverride with Double = js.native
  
  @js.native
  sealed trait caUnknown extends ConflictAll
  /* 0 */ val caUnknown: typingsSlinky.xelib.mod.ConflictAll.caUnknown with Double = js.native
}
