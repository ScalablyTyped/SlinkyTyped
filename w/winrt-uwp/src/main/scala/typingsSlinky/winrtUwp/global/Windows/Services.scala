package typingsSlinky.winrtUwp.global.Windows

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Services {
  
  /** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
  object Maps {
    
    /** Provides APIs for turn-by-turn guided navigation. */
    object Guidance {
      
      /** Specifies the path of the lane. */
      @JSGlobal("Windows.Services.Maps.Guidance.GuidanceLaneMarkers")
      @js.native
      object GuidanceLaneMarkers extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers with Double
              ] = js.native
        
        /* 6 */ val hardLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft with Double = js.native
        
        /* 3 */ val hardRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight with Double = js.native
        
        /* 7 */ val left: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left with Double = js.native
        
        /* 8 */ val lightLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft with Double = js.native
        
        /* 1 */ val lightRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight with Double = js.native
        
        /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none with Double = js.native
        
        /* 2 */ val right: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right with Double = js.native
        
        /* 4 */ val straight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight with Double = js.native
        
        /* 10 */ val unknown: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown with Double = js.native
        
        /* 5 */ val uturnLeft: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft with Double = js.native
        
        /* 9 */ val uturnRight: typingsSlinky.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight with Double = js.native
      }
    }
  }
  
  /** Provides types and members you can use to access and manage Windows Store-related data for the current app. */
  object Store {
    
    /** Provides response data for a request to acquire a downloadable content (DLC) package license. */
    @JSGlobal("Windows.Services.Store.StoreAcquireLicenseResult")
    @js.native
    abstract class StoreAcquireLicenseResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreAcquireLicenseResult
    
    /** Provides license info for the current app, including licenses for products that are offered by the app. */
    @JSGlobal("Windows.Services.Store.StoreAppLicense")
    @js.native
    abstract class StoreAppLicense ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreAppLicense
    
    /** Represents a specific instance of a product SKU that can be purchased. */
    @JSGlobal("Windows.Services.Store.StoreAvailability")
    @js.native
    abstract class StoreAvailability ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreAvailability
    
    /** Provides additional data for a product SKU that the user has an entitlement to use. */
    @JSGlobal("Windows.Services.Store.StoreCollectionData")
    @js.native
    abstract class StoreCollectionData ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreCollectionData
    
    /** Provides response data for a request that involves a consumable add-on for the current app. */
    @JSGlobal("Windows.Services.Store.StoreConsumableResult")
    @js.native
    abstract class StoreConsumableResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableResult
    
    /** Defines values that represent the status of an request that is related to a consumable add-on. */
    @JSGlobal("Windows.Services.Store.StoreConsumableStatus")
    @js.native
    object StoreConsumableStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableStatus with Double] = js.native
      
      /* 1 */ val insufficentQuantity: typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableStatus.insufficentQuantity with Double = js.native
      
      /* 2 */ val networkError: typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableStatus.networkError with Double = js.native
      
      /* 3 */ val serverError: typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableStatus.serverError with Double = js.native
      
      /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Services.Store.StoreConsumableStatus.succeeded with Double = js.native
    }
    
    /** Provides members you can use to access and manage Windows Store-related data for the current app. For example, you can use members of this class to get Windows Store listing and license info for the current app, purchase the current app or products that are offered by the app, or download and install package updates for the app. */
    @JSGlobal("Windows.Services.Store.StoreContext")
    @js.native
    abstract class StoreContext ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreContext
    object StoreContext {
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the current user in the context of the current app.
        * @return An object that you can use to access and manage Windows Store-related data for the current user.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreContext.getDefault")
      @js.native
      def getDefault(): typingsSlinky.winrtUwp.Windows.Services.Store.StoreContext = js.native
      
      /**
        * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the specified user in the context of the current app.
        * @param user An object that identifies the user whose Windows Store-related data you want to access and manage.
        * @return An object that you can use to access and manage Windows Store-related data for the specified user.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreContext.getForUser")
      @js.native
      def getForUser(user: User): typingsSlinky.winrtUwp.Windows.Services.Store.StoreContext = js.native
    }
    
    /** Defines values that represent the units of a trial period or billing period for a subscription. */
    @JSGlobal("Windows.Services.Store.StoreDurationUnit")
    @js.native
    object StoreDurationUnit extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit with Double] = js.native
      
      /* 2 */ val day: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.day with Double = js.native
      
      /* 1 */ val hour: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.hour with Double = js.native
      
      /* 0 */ val minute: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.minute with Double = js.native
      
      /* 4 */ val month: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.month with Double = js.native
      
      /* 3 */ val week: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.week with Double = js.native
      
      /* 5 */ val year: typingsSlinky.winrtUwp.Windows.Services.Store.StoreDurationUnit.year with Double = js.native
    }
    
    /** Represents an image that is associated with a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreImage")
    @js.native
    abstract class StoreImage ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreImage
    
    /** Provides license info for an add-on that is associated with the current app. */
    @JSGlobal("Windows.Services.Store.StoreLicense")
    @js.native
    abstract class StoreLicense ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreLicense
    
    /** Provides license info for a downloadable content (DLC) package for the current app. */
    @JSGlobal("Windows.Services.Store.StorePackageLicense")
    @js.native
    abstract class StorePackageLicense ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageLicense
    
    /** Provides info about a package for the current app that has an update available for download from the Windows Store. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdate")
    @js.native
    abstract class StorePackageUpdate ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdate
    
    /** Provides info about a completed package update request for the current app. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdateResult")
    @js.native
    abstract class StorePackageUpdateResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateResult
    
    /** Defines values that represent the state of a package download or installation request. */
    @JSGlobal("Windows.Services.Store.StorePackageUpdateState")
    @js.native
    object StorePackageUpdateState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState with Double
          ] = js.native
      
      /* 4 */ val canceled: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.canceled with Double = js.native
      
      /* 3 */ val completed: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.completed with Double = js.native
      
      /* 2 */ val deploying: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.deploying with Double = js.native
      
      /* 1 */ val downloading: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.downloading with Double = js.native
      
      /* 6 */ val errorLowBattery: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorLowBattery with Double = js.native
      
      /* 7 */ val errorWiFiRecommended: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRecommended with Double = js.native
      
      /* 8 */ val errorWiFiRequired: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRequired with Double = js.native
      
      /* 5 */ val otherError: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.otherError with Double = js.native
      
      /* 0 */ val pending: typingsSlinky.winrtUwp.Windows.Services.Store.StorePackageUpdateState.pending with Double = js.native
    }
    
    /** Contains pricing info for a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StorePrice")
    @js.native
    abstract class StorePrice ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePrice
    
    /** Represents a product that is available in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreProduct")
    @js.native
    abstract class StoreProduct ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreProduct
    
    /** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductPagedQueryResult")
    @js.native
    abstract class StoreProductPagedQueryResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreProductPagedQueryResult
    
    /** Provides response data for a request to retrieve details about products that can be purchased from within the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductQueryResult")
    @js.native
    abstract class StoreProductQueryResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreProductQueryResult
    
    /** Provides response data for a request to retrieve details about the current app. */
    @JSGlobal("Windows.Services.Store.StoreProductResult")
    @js.native
    abstract class StoreProductResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreProductResult
    
    /** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
    @JSGlobal("Windows.Services.Store.StorePurchaseProperties")
    @js.native
    /** Initializes a new instance of the StorePurchaseProperties class. */
    class StorePurchaseProperties ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseProperties {
      /** Initializes a new instance of the StorePurchaseProperties class. This overload provides the option to specify the product name that is displayed to the user during the purchase.
        * @param name The product name that is displayed to the user during the purchase.
        */
      def this(name: String) = this()
    }
    
    /** Provides response data for a request to purchase an app or product that is offered by the app. */
    @JSGlobal("Windows.Services.Store.StorePurchaseResult")
    @js.native
    abstract class StorePurchaseResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseResult
    
    /** Defines values that represent the status of a request to purchase an app or add-on. */
    @JSGlobal("Windows.Services.Store.StorePurchaseStatus")
    @js.native
    object StorePurchaseStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus with Double] = js.native
      
      /* 1 */ val alreadyPurchased: typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus.alreadyPurchased with Double = js.native
      
      /* 3 */ val networkError: typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus.networkError with Double = js.native
      
      /* 2 */ val notPurchased: typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus.notPurchased with Double = js.native
      
      /* 4 */ val serverError: typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus.serverError with Double = js.native
      
      /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Services.Store.StorePurchaseStatus.succeeded with Double = js.native
    }
    
    /** Provides a helper method that can be used to send requests to the Windows Store for operations that do not yet have a corresponding API available in the Windows SDK. */
    @JSGlobal("Windows.Services.Store.StoreRequestHelper")
    @js.native
    abstract class StoreRequestHelper ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreRequestHelper
    object StoreRequestHelper {
      
      /**
        * Sends the specified request to the Windows Store with the provided context and parameters.
        * @param context An object that specifies the user for which to perform the operation. If your app is a single-user app (that is, it runs only in the context of the user that launched the app), use the StoreContext.GetDefault method to get a StoreContext object that you can use to send a request that operates in the context of the user. If your app is a multi-user app, use the StoreContext.GetForUser method to get a StoreContext object that you can use to send a request that operates in the context of a specific user.
        * @param requestKind A value that identifies the request that you want to send to the Windows Store.
        * @param parametersAsJson A JSON-formatted string that contains the arguments to pass to the request.
        * @return An asynchronous operation that, on successful completion, returns a StoreSendRequestResult object that provides status and error info about the request.
        */
      /* static member */
      @JSGlobal("Windows.Services.Store.StoreRequestHelper.sendRequestAsync")
      @js.native
      def sendRequestAsync(
        context: typingsSlinky.winrtUwp.Windows.Services.Store.StoreContext,
        requestKind: Double,
        parametersAsJson: String
      ): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Services.Store.StoreSendRequestResult] = js.native
    }
    
    /** Provides response data for a request that is sent to the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreSendRequestResult")
    @js.native
    abstract class StoreSendRequestResult ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreSendRequestResult
    
    /** Provides info for a SKU of a product in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreSku")
    @js.native
    abstract class StoreSku ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreSku
    
    /** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
    @JSGlobal("Windows.Services.Store.StoreSubscriptionInfo")
    @js.native
    abstract class StoreSubscriptionInfo ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreSubscriptionInfo
    
    /** Represents a video that is associated with a product listing in the Windows Store. */
    @JSGlobal("Windows.Services.Store.StoreVideo")
    @js.native
    abstract class StoreVideo ()
      extends typingsSlinky.winrtUwp.Windows.Services.Store.StoreVideo
  }
}
