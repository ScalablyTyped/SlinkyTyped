package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets you add and remove folders from a library like Music or Videos and lets you get a list of folders included in the library. */
@JSGlobal("Windows.Storage.StorageLibrary")
@js.native
abstract class StorageLibrary ()
  extends typingsSlinky.winrtUwp.Windows.Storage.StorageLibrary
object StorageLibrary {
  
  /**
    * Gets the specified library.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  /* static member */
  @JSGlobal("Windows.Storage.StorageLibrary.getLibraryAsync")
  @js.native
  def getLibraryAsync(libraryId: typingsSlinky.winrtUwp.Windows.Storage.KnownLibraryId): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageLibrary] = js.native
  
  /**
    * Gets the specified library for a User .
    * @param user The User for which the library is retrieved.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  /* static member */
  @JSGlobal("Windows.Storage.StorageLibrary.getLibraryForUserAsync")
  @js.native
  def getLibraryForUserAsync(user: User, libraryId: typingsSlinky.winrtUwp.Windows.Storage.KnownLibraryId): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.StorageLibrary] = js.native
}
