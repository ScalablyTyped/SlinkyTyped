package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object titanium {
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type ContactsAuthorizationResponse = typingsSlinky.titanium.ErrorResponse
  
  type Dictionary[T] = typingsSlinky.std.Partial[
    typingsSlinky.titanium.Omit[
      T, 
      typingsSlinky.titanium.FunctionPropertyNames[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Proxy */ js.Any
      ]
    ]
  ]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type LocationAuthorizationResponse = typingsSlinky.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type MediaAuthorizationResponse = typingsSlinky.titanium.ErrorResponse
  
  type Omit[T, K /* <: js.UndefOr[/* keyof any */ java.lang.String] */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestCameraAccessResult = typingsSlinky.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestMusicLibraryAccessResult = typingsSlinky.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestPermissionAccessResult = typingsSlinky.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestPhotoGalleryAccessResult = typingsSlinky.titanium.ErrorResponse
  
  /**
    * Argument passed to the callback when a request finishes successfully or erroneously.
    */
  type RequestStorageAccessResult = typingsSlinky.titanium.ErrorResponse
}
