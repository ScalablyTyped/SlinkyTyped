package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a list of ContactAnnotation objects. */
@js.native
trait ContactAnnotationList extends StObject {
  
  /**
    * Asynchronously deletes the specified ContactAnnotation from the list.
    * @param annotation The annotation to delete from the list.
    * @return An async action indicating that the operation has completed.
    */
  def deleteAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously deletes this ContactAnnotationList from the ContactAnnotationStore .
    * @return An async action indicating that the operation has completed.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously gets the list of ContactAnnotation objects.
    * @return The list of ContactAnnotation objects.
    */
  def findAnnotationsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets the list of ContactAnnotation objects containing the specified remote ID property.
    * @param remoteId The remote ID used to find the ContactAnnotation objects.
    * @return The list of ContactAnnotation objects containing the specified remote ID property.
    */
  def findAnnotationsByRemoteIdAsync(remoteId: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets the ContactAnnotation with the specified Id .
    * @param annotationId The ContactAnnotation.Id used to identify the ContactAnnotation .
    * @return The ContactAnnotation with the specified ID.
    */
  def getAnnotationAsync(annotationId: String): IPromiseWithIAsyncOperation[ContactAnnotation] = js.native
  
  /** Gets the ID for this ContactAnnotationList . */
  var id: String = js.native
  
  /** Gets the unique identifier for the app package that created the ContactAnnotationList . */
  var providerPackageFamilyName: String = js.native
  
  /**
    * Asynchronously attempts to save the ContactAnnotation to the ContactAnnotationList .
    * @param annotation The annotation to save to the list.
    * @return True if the save was successful, otherwise false.
    */
  def trySaveAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the ID for the UserDataAccount used by the app. */
  var userDataAccountId: String = js.native
}
object ContactAnnotationList {
  
  @scala.inline
  def apply(
    deleteAnnotationAsync: ContactAnnotation => IPromiseWithIAsyncAction,
    deleteAsync: () => IPromiseWithIAsyncAction,
    findAnnotationsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findAnnotationsByRemoteIdAsync: String => IPromiseWithIAsyncOperation[IVectorView[_]],
    getAnnotationAsync: String => IPromiseWithIAsyncOperation[ContactAnnotation],
    id: String,
    providerPackageFamilyName: String,
    trySaveAnnotationAsync: ContactAnnotation => IPromiseWithIAsyncOperation[Boolean],
    userDataAccountId: String
  ): ContactAnnotationList = {
    val __obj = js.Dynamic.literal(deleteAnnotationAsync = js.Any.fromFunction1(deleteAnnotationAsync), deleteAsync = js.Any.fromFunction0(deleteAsync), findAnnotationsAsync = js.Any.fromFunction0(findAnnotationsAsync), findAnnotationsByRemoteIdAsync = js.Any.fromFunction1(findAnnotationsByRemoteIdAsync), getAnnotationAsync = js.Any.fromFunction1(getAnnotationAsync), id = id.asInstanceOf[js.Any], providerPackageFamilyName = providerPackageFamilyName.asInstanceOf[js.Any], trySaveAnnotationAsync = js.Any.fromFunction1(trySaveAnnotationAsync), userDataAccountId = userDataAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAnnotationList]
  }
  
  @scala.inline
  implicit class ContactAnnotationListMutableBuilder[Self <: ContactAnnotationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteAnnotationAsync(value: ContactAnnotation => IPromiseWithIAsyncAction): Self = StObject.set(x, "deleteAnnotationAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "deleteAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindAnnotationsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findAnnotationsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindAnnotationsByRemoteIdAsync(value: String => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findAnnotationsByRemoteIdAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAnnotationAsync(value: String => IPromiseWithIAsyncOperation[ContactAnnotation]): Self = StObject.set(x, "getAnnotationAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderPackageFamilyName(value: String): Self = StObject.set(x, "providerPackageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySaveAnnotationAsync(value: ContactAnnotation => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySaveAnnotationAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserDataAccountId(value: String): Self = StObject.set(x, "userDataAccountId", value.asInstanceOf[js.Any])
  }
}
