package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides types for interacting with the Wallet feature of Windows Phone from a Windows Runtime app. */
@JSGlobal("Windows.ApplicationModel.Wallet")
@js.native
object Wallet extends js.Object {
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
  @js.native
  object System extends js.Object {
    
    /** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
    @js.native
    object WalletItemAppAssociation extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation with Double
          ] = js.native
      
      /* 1 */ val appInstalled: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.appInstalled with Double = js.native
      
      /* 2 */ val appNotInstalled: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.appNotInstalled with Double = js.native
      
      /* 0 */ val none: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.none with Double = js.native
    }
    
    /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
    @js.native
    abstract class WalletItemSystemStore ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemSystemStore
    
    /** Provides a static method to get an instance of the system wallet store for this app. */
    @js.native
    abstract class WalletManagerSystem ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletManagerSystem
    /* static members */
    @js.native
    object WalletManagerSystem extends js.Object {
      
      /**
        * Requests an instance of the system wallet store for the app.
        * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemSystemStore object.
        */
      def requestStoreAsync(): IPromiseWithIAsyncOperation[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemSystemStore
          ] = js.native
    }
  }
  
  /** Represents the action that was taken on the item that caused your app to launch. */
  @js.native
  object WalletActionKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind with Double
      ] = js.native
    
    /* 3 */ val message: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.message with Double = js.native
    
    /* 2 */ val moreTransactions: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.moreTransactions with Double = js.native
    
    /* 0 */ val openItem: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.openItem with Double = js.native
    
    /* 1 */ val transaction: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.transaction with Double = js.native
    
    /* 4 */ val verb: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.verb with Double = js.native
  }
  
  /** Represents a bar code assigned to a wallet item. */
  @js.native
  class WalletBarcode protected ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcode {
    /**
      * Initializes a new instance of the WalletBarcode class.
      * @param streamToBarcodeImage A stream representing the bar code image.
      */
    def this(streamToBarcodeImage: IRandomAccessStreamReference) = this()
    /**
      * Initializes a new instance of the WalletBarcode class.
      * @param symbology The symbology type for this barcode. Use one of the supported symbologies, such as Upca. Don't set to Invalid or Custom.
      * @param value The message ( Value ) that the barcode represents.
      */
    def this(symbology: WalletBarcodeSymbology, value: String) = this()
  }
  
  /** Represents the barcode symbology types that are supported for a WalletItem . */
  @js.native
  object WalletBarcodeSymbology extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology with Double
      ] = js.native
    
    /* 10 */ val aztec: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.aztec with Double = js.native
    
    /* 7 */ val code128: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code128 with Double = js.native
    
    /* 6 */ val code39: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code39 with Double = js.native
    
    /* 11 */ val custom: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.custom with Double = js.native
    
    /* 3 */ val ean13: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean13 with Double = js.native
    
    /* 4 */ val ean8: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean8 with Double = js.native
    
    /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.invalid with Double = js.native
    
    /* 5 */ val itf: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.itf with Double = js.native
    
    /* 9 */ val pdf417: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.pdf417 with Double = js.native
    
    /* 8 */ val qr: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.qr with Double = js.native
    
    /* 1 */ val upca: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upca with Double = js.native
    
    /* 2 */ val upce: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upce with Double = js.native
  }
  
  /** Describes the position in the detail view of a wallet item that a WalletItemCustomProperty record should be displayed at. */
  @js.native
  object WalletDetailViewPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition with Double
      ] = js.native
    
    /* 10 */ val centerField1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.centerField1 with Double = js.native
    
    /* 11 */ val footerField1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField1 with Double = js.native
    
    /* 12 */ val footerField2: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField2 with Double = js.native
    
    /* 13 */ val footerField3: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField3 with Double = js.native
    
    /* 14 */ val footerField4: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField4 with Double = js.native
    
    /* 1 */ val headerField1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField1 with Double = js.native
    
    /* 2 */ val headerField2: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField2 with Double = js.native
    
    /* 0 */ val hidden: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.hidden with Double = js.native
    
    /* 3 */ val primaryField1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField1 with Double = js.native
    
    /* 4 */ val primaryField2: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField2 with Double = js.native
    
    /* 5 */ val secondaryField1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField1 with Double = js.native
    
    /* 6 */ val secondaryField2: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField2 with Double = js.native
    
    /* 7 */ val secondaryField3: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField3 with Double = js.native
    
    /* 8 */ val secondaryField4: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField4 with Double = js.native
    
    /* 9 */ val secondaryField5: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField5 with Double = js.native
  }
  
  /** Represents an item (data) that is stored in the wallet. */
  @js.native
  class WalletItem protected ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItem {
    /**
      * Initializes a new instance of the WalletItem class.
      * @param kind The type of wallet item.
      * @param displayName The display name of the item.
      */
    def this(kind: WalletItemKind, displayName: String) = this()
  }
  
  /** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
  @js.native
  class WalletItemCustomProperty protected ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemCustomProperty {
    /**
      * Initializes a new instance of the WalletItemCustomProperty class.
      * @param name The custom property label. Sets the initial Name value.
      * @param value The value of the property. Sets the initial Value value.
      */
    def this(name: String, value: String) = this()
  }
  
  /** Represents the kinds (classifications) of wallet items supported. */
  @js.native
  object WalletItemKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind with Double
      ] = js.native
    
    /* 5 */ val boardingPass: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.boardingPass with Double = js.native
    
    /* 1 */ val deal: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.deal with Double = js.native
    
    /* 2 */ val general: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.general with Double = js.native
    
    /* 0 */ val invalid: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.invalid with Double = js.native
    
    /* 6 */ val membershipCard: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.membershipCard with Double = js.native
    
    /* 3 */ val paymentInstrument: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.paymentInstrument with Double = js.native
    
    /* 4 */ val ticket: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.ticket with Double = js.native
  }
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the wallet database. These can be used to read the existing items, or to add and remove items. */
  @js.native
  abstract class WalletItemStore ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemStore
  
  /** Provides a static method to get an instance of the default wallet store for this app. */
  @js.native
  abstract class WalletManager ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletManager
  /* static members */
  @js.native
  object WalletManager extends js.Object {
    
    /**
      * Requests an instance of the default wallet store for the app.
      * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemStore object.
      */
    def requestStoreAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemStore] = js.native
  }
  
  /** Represents relevant location data for a wallet item. */
  @js.native
  /** Initializes a new instance of the WalletRelevantLocation class. */
  class WalletRelevantLocation ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletRelevantLocation
  
  /** Describes the position in the summary view of a wallet item that a WalletItemCustomProperty should be displayed. */
  @js.native
  object WalletSummaryViewPosition extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition with Double
      ] = js.native
    
    /* 1 */ val field1: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.field1 with Double = js.native
    
    /* 2 */ val field2: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.field2 with Double = js.native
    
    /* 0 */ val hidden: typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.hidden with Double = js.native
  }
  
  /** Represents a single wallet transaction in the transaction history. */
  @js.native
  /** Initializes a new instance of the WalletTransaction class. */
  class WalletTransaction ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletTransaction
  
  /** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
  @js.native
  class WalletVerb protected ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet.WalletVerb {
    /**
      * Initializes a new instance of the WalletVerb class.
      * @param name The name of the custom verb. Sets the value of the Name property.
      */
    def this(name: String) = this()
  }
}
