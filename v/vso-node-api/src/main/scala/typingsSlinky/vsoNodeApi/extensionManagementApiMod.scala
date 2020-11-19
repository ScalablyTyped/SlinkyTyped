package typingsSlinky.vsoNodeApi

import typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOptions
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionAcquisitionRequest
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionAuthorization
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionDataCollection
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionDataCollectionQuery
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestState
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ExtensionState
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtension
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionQuery
import typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.RequestedExtension
import typingsSlinky.vsoNodeApi.galleryInterfacesMod.UserExtensionPolicy
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/ExtensionManagementApi", JSImport.Namespace)
@js.native
object extensionManagementApiMod extends js.Object {
  
  @js.native
  class ExtensionManagementApi protected () extends IExtensionManagementApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  @js.native
  object ExtensionManagementApi extends js.Object {
    
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IExtensionManagementApi extends ClientApiBase {
    
    def createDocumentByName(
      doc: js.Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[_] = js.native
    
    def deleteDocumentByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String,
      documentId: String
    ): js.Promise[Unit] = js.native
    
    def deleteRequest(publisherName: String, extensionName: String): js.Promise[Unit] = js.native
    
    def getAcquisitionOptions(itemId: String): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(
      itemId: String,
      testCommerce: js.UndefOr[scala.Nothing],
      isFreeOrTrialInstall: js.UndefOr[scala.Nothing],
      isAccountOwner: Boolean
    ): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: js.UndefOr[scala.Nothing], isFreeOrTrialInstall: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(
      itemId: String,
      testCommerce: js.UndefOr[scala.Nothing],
      isFreeOrTrialInstall: Boolean,
      isAccountOwner: Boolean
    ): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(
      itemId: String,
      testCommerce: Boolean,
      isFreeOrTrialInstall: js.UndefOr[scala.Nothing],
      isAccountOwner: Boolean
    ): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean, isFreeOrTrialInstall: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean, isFreeOrTrialInstall: Boolean, isAccountOwner: Boolean): js.Promise[AcquisitionOptions] = js.native
    
    def getDocumentByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String,
      documentId: String
    ): js.Promise[_] = js.native
    
    def getDocumentsByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[js.Array[_]] = js.native
    
    def getInstalledExtensionByName(publisherName: String, extensionName: String): js.Promise[InstalledExtension] = js.native
    def getInstalledExtensionByName(publisherName: String, extensionName: String, assetTypes: js.Array[String]): js.Promise[InstalledExtension] = js.native
    
    def getInstalledExtensions(): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.Array[String]
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: js.UndefOr[scala.Nothing], includeErrors: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: Boolean,
      assetTypes: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: Boolean,
      assetTypes: js.Array[String]
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: js.UndefOr[scala.Nothing],
      includeErrors: Boolean,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.Array[String]
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: js.UndefOr[scala.Nothing],
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean, includeErrors: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Boolean,
      assetTypes: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean, includeErrors: Boolean, assetTypes: js.Array[String]): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Boolean,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    
    def getPolicies(userId: String): js.Promise[UserExtensionPolicy] = js.native
    
    def getRequests(): js.Promise[js.Array[RequestedExtension]] = js.native
    
    def getStates(): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(
      includeDisabled: js.UndefOr[scala.Nothing],
      includeErrors: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: js.UndefOr[scala.Nothing], includeErrors: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(
      includeDisabled: js.UndefOr[scala.Nothing],
      includeErrors: Boolean,
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(
      includeDisabled: Boolean,
      includeErrors: js.UndefOr[scala.Nothing],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean, includeErrors: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean, includeErrors: Boolean, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    
    def getToken(): js.Promise[String] = js.native
    
    def installExtensionByName(publisherName: String, extensionName: String): js.Promise[InstalledExtension] = js.native
    def installExtensionByName(publisherName: String, extensionName: String, version: String): js.Promise[InstalledExtension] = js.native
    
    def queryCollectionsByName(collectionQuery: ExtensionDataCollectionQuery, publisherName: String, extensionName: String): js.Promise[js.Array[ExtensionDataCollection]] = js.native
    
    def queryExtensions(query: InstalledExtensionQuery): js.Promise[js.Array[InstalledExtension]] = js.native
    
    def registerAuthorization(publisherName: String, extensionName: String, registrationId: String): js.Promise[ExtensionAuthorization] = js.native
    
    def requestAcquisition(acquisitionRequest: ExtensionAcquisitionRequest): js.Promise[ExtensionAcquisitionRequest] = js.native
    
    def requestExtension(publisherName: String, extensionName: String, requestMessage: String): js.Promise[RequestedExtension] = js.native
    
    def resolveAllRequests(rejectMessage: String, publisherName: String, extensionName: String, state: ExtensionRequestState): js.Promise[Double] = js.native
    
    def resolveRequest(
      rejectMessage: String,
      publisherName: String,
      extensionName: String,
      requesterId: String,
      state: ExtensionRequestState
    ): js.Promise[Double] = js.native
    
    def setDocumentByName(
      doc: js.Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[_] = js.native
    
    def uninstallExtensionByName(publisherName: String, extensionName: String): js.Promise[Unit] = js.native
    def uninstallExtensionByName(
      publisherName: String,
      extensionName: String,
      reason: js.UndefOr[scala.Nothing],
      reasonCode: String
    ): js.Promise[Unit] = js.native
    def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String): js.Promise[Unit] = js.native
    def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String, reasonCode: String): js.Promise[Unit] = js.native
    
    def updateDocumentByName(
      doc: js.Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[_] = js.native
    
    def updateInstalledExtension(extension: InstalledExtension): js.Promise[InstalledExtension] = js.native
  }
}
