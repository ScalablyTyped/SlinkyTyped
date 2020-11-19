package typingsSlinky.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemStorageState extends js.Object
@JSImport("tizen-common-web/filesystem", "FileSystemStorageState")
@js.native
object FileSystemStorageState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileSystemStorageState with String] = js.native
  
  @js.native
  sealed trait MOUNTED extends FileSystemStorageState
  /* "MOUNTED" */ @js.native
  object MOUNTED extends TopLevel[MOUNTED with String]
  
  @js.native
  sealed trait REMOVED extends FileSystemStorageState
  /* "REMOVED" */ @js.native
  object REMOVED extends TopLevel[REMOVED with String]
  
  @js.native
  sealed trait UNMOUNTABLE extends FileSystemStorageState
  /* "UNMOUNTABLE" */ @js.native
  object UNMOUNTABLE extends TopLevel[UNMOUNTABLE with String]
}
