package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileWatcherEventKind extends js.Object
@JSImport("typescript", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind with Double] = js.native
  
  @js.native
  sealed trait Changed extends FileWatcherEventKind
  /* 1 */ @js.native
  object Changed extends TopLevel[Changed with Double]
  
  @js.native
  sealed trait Created extends FileWatcherEventKind
  /* 0 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  @js.native
  sealed trait Deleted extends FileWatcherEventKind
  /* 2 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
}
