package typingsSlinky.winrt.Windows.Storage.Provider

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICachedFileUpdaterStatics extends StObject {
  
  def setUpdateInformation(
    file: IStorageFile,
    contentId: String,
    readMode: ReadActivationMode,
    writeMode: WriteActivationMode,
    options: CachedFileOptions
  ): Unit = js.native
}
object ICachedFileUpdaterStatics {
  
  @scala.inline
  def apply(
    setUpdateInformation: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Unit
  ): ICachedFileUpdaterStatics = {
    val __obj = js.Dynamic.literal(setUpdateInformation = js.Any.fromFunction5(setUpdateInformation))
    __obj.asInstanceOf[ICachedFileUpdaterStatics]
  }
  
  @scala.inline
  implicit class ICachedFileUpdaterStaticsMutableBuilder[Self <: ICachedFileUpdaterStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetUpdateInformation(value: (IStorageFile, String, ReadActivationMode, WriteActivationMode, CachedFileOptions) => Unit): Self = StObject.set(x, "setUpdateInformation", js.Any.fromFunction5(value))
  }
}
