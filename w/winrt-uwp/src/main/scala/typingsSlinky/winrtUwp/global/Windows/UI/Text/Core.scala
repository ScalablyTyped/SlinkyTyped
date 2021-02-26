package typingsSlinky.winrtUwp.global.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides types for accessing the Windows core text APIs and the text input server. Windows core text is a client-server system that centralizes the processing of keyboard input into a single server. You can use it to manipulate the edit buffer of your custom text input control; the text input server ensures that the contents of your text input control and the contents of its own edit buffer are always in sync via an asynchronous communication channel between the application and the server. */
object Core {
  
  /** Provides data for the CompositionCompleted event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs")
  @js.native
  abstract class CoreTextCompositionCompletedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs
  
  /** Represents a segment in a composition string. See Remarks for an illustration. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionSegment")
  @js.native
  abstract class CoreTextCompositionSegment ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionSegment
  
  /** Provides data for the CompositionStarted event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
  @js.native
  abstract class CoreTextCompositionStartedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs
  
  /** The primary object used by text input controls to communicate with the text input server. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextEditContext")
  @js.native
  abstract class CoreTextEditContext ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextEditContext
  
  /** Provides data for the FormatUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs")
  @js.native
  abstract class CoreTextFormatUpdatingEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs
  
  /** Defines constants that specify the set of state applied during text composition. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingReason")
  @js.native
  object CoreTextFormatUpdatingReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason with Double
      ] = js.native
    
    /* 2 */ val compositionConverted: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionConverted with Double = js.native
    
    /* 4 */ val compositionTargetConverted: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetConverted with Double = js.native
    
    /* 3 */ val compositionTargetUnconverted: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetUnconverted with Double = js.native
    
    /* 1 */ val compositionUnconverted: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionUnconverted with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.none with Double = js.native
  }
  
  /** Defines constants that specify the result of handling the FormatUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingResult")
  @js.native
  object CoreTextFormatUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult with Double
      ] = js.native
    
    /* 1 */ val failed: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.failed with Double = js.native
    
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.succeeded with Double = js.native
  }
  
  /** Defines constants that specify whether the input pane should be shown automatically when focus enters your text input control. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy")
  @js.native
  object CoreTextInputPaneDisplayPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy with Double
      ] = js.native
    
    /* 0 */ val automatic: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.automatic with Double = js.native
    
    /* 1 */ val manual: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.manual with Double = js.native
  }
  
  /** Defines constants that specify the set of input scope names. Input scope is used by the text input server and input processors to determine the layout of the Soft Input Panel (SIP), and what type of language model to use. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputScope")
  @js.native
  object CoreTextInputScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope with Double] = js.native
    
    /* 0 */ val default: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.default with Double = js.native
    
    /* 13 */ val address: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.address with Double = js.native
    
    /* 17 */ val addressCity: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCity with Double = js.native
    
    /* 18 */ val addressCountryName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryName with Double = js.native
    
    /* 19 */ val addressCountryShortName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryShortName with Double = js.native
    
    /* 14 */ val addressPostalCode: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressPostalCode with Double = js.native
    
    /* 16 */ val addressStateOrProvince: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStateOrProvince with Double = js.native
    
    /* 15 */ val addressStreet: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStreet with Double = js.native
    
    /* 40 */ val alphanumericFullWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericFullWidth with Double = js.native
    
    /* 39 */ val alphanumericHalfWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericHalfWidth with Double = js.native
    
    /* 42 */ val bopomofo: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.bopomofo with Double = js.native
    
    /* 56 */ val chat: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chat with Double = js.native
    
    /* 53 */ val chineseFullWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseFullWidth with Double = js.native
    
    /* 52 */ val chineseHalfWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseHalfWidth with Double = js.native
    
    /* 21 */ val currencyAmount: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmount with Double = js.native
    
    /* 20 */ val currencyAmountAndSymbol: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmountAndSymbol with Double = js.native
    
    /* 41 */ val currencyChinese: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyChinese with Double = js.native
    
    /* 22 */ val date: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.date with Double = js.native
    
    /* 24 */ val dateDay: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDay with Double = js.native
    
    /* 27 */ val dateDayName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDayName with Double = js.native
    
    /* 23 */ val dateMonth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonth with Double = js.native
    
    /* 26 */ val dateMonthName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonthName with Double = js.native
    
    /* 25 */ val dateYear: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateYear with Double = js.native
    
    /* 5 */ val emailAddress: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailAddress with Double = js.native
    
    /* 4 */ val emailUserName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserName with Double = js.native
    
    /* 58 */ val emailUserNameOrAddress: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserNameOrAddress with Double = js.native
    
    /* 3 */ val fileName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.fileName with Double = js.native
    
    /* 2 */ val filePath: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.filePath with Double = js.native
    
    /* 50 */ val formula: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formula with Double = js.native
    
    /* 62 */ val formulaNumber: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formulaNumber with Double = js.native
    
    /* 48 */ val hangulFullWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulFullWidth with Double = js.native
    
    /* 47 */ val hangulHalfWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulHalfWidth with Double = js.native
    
    /* 46 */ val hanja: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hanja with Double = js.native
    
    /* 43 */ val hiragana: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hiragana with Double = js.native
    
    /* 45 */ val katakanaFullWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaFullWidth with Double = js.native
    
    /* 44 */ val katakanaHalfWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaHalfWidth with Double = js.native
    
    /* 60 */ val maps: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.maps with Double = js.native
    
    /* 57 */ val nameOrPhoneNumber: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nameOrPhoneNumber with Double = js.native
    
    /* 54 */ val nativeScript: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nativeScript with Double = js.native
    
    /* 28 */ val number: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.number with Double = js.native
    
    /* 38 */ val numberFullWidth: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.numberFullWidth with Double = js.native
    
    /* 30 */ val password: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.password with Double = js.native
    
    /* 61 */ val passwordNumeric: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.passwordNumeric with Double = js.native
    
    /* 7 */ val personalFullName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalFullName with Double = js.native
    
    /* 9 */ val personalGivenName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalGivenName with Double = js.native
    
    /* 10 */ val personalMiddleName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalMiddleName with Double = js.native
    
    /* 8 */ val personalNamePrefix: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNamePrefix with Double = js.native
    
    /* 12 */ val personalNameSuffix: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNameSuffix with Double = js.native
    
    /* 11 */ val personalSurname: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalSurname with Double = js.native
    
    /* 59 */ val `private`: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.`private` with Double = js.native
    
    /* 49 */ val search: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.search with Double = js.native
    
    /* 51 */ val searchIncremental: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.searchIncremental with Double = js.native
    
    /* 29 */ val singleCharacter: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.singleCharacter with Double = js.native
    
    /* 33 */ val telephoneAreaCode: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneAreaCode with Double = js.native
    
    /* 32 */ val telephoneCountryCode: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneCountryCode with Double = js.native
    
    /* 34 */ val telephoneLocalNumber: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneLocalNumber with Double = js.native
    
    /* 31 */ val telephoneNumber: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneNumber with Double = js.native
    
    /* 55 */ val text: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.text with Double = js.native
    
    /* 35 */ val time: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.time with Double = js.native
    
    /* 36 */ val timeHour: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeHour with Double = js.native
    
    /* 37 */ val timeMinuteOrSecond: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeMinuteOrSecond with Double = js.native
    
    /* 1 */ val url: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.url with Double = js.native
    
    /* 6 */ val userName: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.userName with Double = js.native
  }
  
  /** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutBounds")
  @js.native
  abstract class CoreTextLayoutBounds ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds
  
  /** Represents information about a LayoutRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequest")
  @js.native
  abstract class CoreTextLayoutRequest ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest
  
  /** Provides data for the LayoutRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs")
  @js.native
  abstract class CoreTextLayoutRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs
  
  /** Represents information about a SelectionRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
  @js.native
  abstract class CoreTextSelectionRequest ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest
  
  /** Provides data for the SelectionRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs")
  @js.native
  abstract class CoreTextSelectionRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs
  
  /** Provides data for the SelectionUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs")
  @js.native
  abstract class CoreTextSelectionUpdatingEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs
  
  /** Defines constants that specify the result of handling the SelectionUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingResult")
  @js.native
  object CoreTextSelectionUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult with Double
      ] = js.native
    
    /* 1 */ val failed: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.failed with Double = js.native
    
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.succeeded with Double = js.native
  }
  
  /** Provides constant values for use with the Windows core text APIs and the text input server. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
  @js.native
  abstract class CoreTextServicesConstants ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextServicesConstants
  object CoreTextServicesConstants {
    
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a value to use to replace hidden data inside a text stream before returning the text to the text input server. */
    /* static member */
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants.hiddenCharacter")
    @js.native
    def hiddenCharacter: String = js.native
    @scala.inline
    def hiddenCharacter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenCharacter")(x.asInstanceOf[js.Any])
  }
  
  /** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
  @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
  @js.native
  abstract class CoreTextServicesManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager
  object CoreTextServicesManager {
    
    /**
      * Gets the CoreTextServicesManager object for the currently active view.
      * @return A CoreTextServicesManager instance, which can be used to create further objects to support the app's text input scenarios.
      */
    /* static member */
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager = js.native
  }
  
  /** Represents information about a TextRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequest")
  @js.native
  abstract class CoreTextTextRequest ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest
  
  /** Provides data for the TextRequested event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequestedEventArgs")
  @js.native
  abstract class CoreTextTextRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequestedEventArgs
  
  /** Provides data for the TextUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs")
  @js.native
  abstract class CoreTextTextUpdatingEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs
  
  /** Defines constants that specify the result of handling the TextUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingResult")
  @js.native
  object CoreTextTextUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult with Double
      ] = js.native
    
    /* 1 */ val failed: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.failed with Double = js.native
    
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.succeeded with Double = js.native
  }
}
