package typingsSlinky.winrtUwp.global.Windows.Globalization

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for formatting currencies, decimal numbers, percent values, and permille values, based on the user's languages and geographic region. */
@JSGlobal("Windows.Globalization.NumberFormatting")
@js.native
object NumberFormatting extends js.Object {
  
  /** Formats and parses currencies. */
  @js.native
  class CurrencyFormatter protected ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatter {
    /**
      * Creates a CurrencyFormatter object that is initialized with a currency identifier.
      * @param currencyCode The currency identifier to use when formatting and parsing currency values.
      */
    def this(currencyCode: String) = this()
    /**
      * Creates a CurrencyFormatter object initialized with a currency identifier, language list, and geographic region.
      * @param currencyCode The currency identifier to use when formatting and parsing currency values.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Specifies the use of symbols or codes when currency is formatted. */
  @js.native
  object CurrencyFormatterMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode with Double
      ] = js.native
    
    /* 1 */ val useCurrencyCode: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useCurrencyCode with Double = js.native
    
    /* 0 */ val useSymbol: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.CurrencyFormatterMode.useSymbol with Double = js.native
  }
  
  /** Formats and parses decimal numbers. */
  @js.native
  /** Creates a DecimalFormatter object and initializes it to default values. */
  class DecimalFormatter ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.DecimalFormatter {
    /**
      * Creates a DecimalFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Rounds numbers to a specified increment. */
  @js.native
  /** Creates an IncrementNumberRounder object. */
  class IncrementNumberRounder ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.IncrementNumberRounder
  
  /** Translates digits of the Latin numerical system into digits of another numerical system. */
  @js.native
  /** Creates a NumeralSystemTranslator object initialized by the list of current runtime language values preferred by the user. */
  class NumeralSystemTranslator ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.NumeralSystemTranslator {
    /**
      * Creates a NumeralSystemTranslator object initialized by a language list.
      * @param languages A list of BCP-47 language tags, in priority order, representing the choice of languages. They must all be well-formed according to Windows.Globalization.Language.isWellFormed .
      */
    def this(languages: IIterable[String]) = this()
  }
  
  /** Formats and parses percentages. */
  @js.native
  /** Creates a PercentFormatter object and initializes it to default values. */
  class PercentFormatter ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.PercentFormatter {
    /**
      * Creates a PercentFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Formats and parses permillages. */
  @js.native
  /** Creates a PermilleFormatter object and initializes it to default values. */
  class PermilleFormatter ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.PermilleFormatter {
    /**
      * Creates a PermilleFormatter object initialized by a language list and a geographic region.
      * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
      * @param geographicRegion The identifier for the geographic region.
      */
    def this(languages: IIterable[String], geographicRegion: String) = this()
  }
  
  /** Specifies the algorithm used to round numbers. */
  @js.native
  object RoundingAlgorithm extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm with Double
      ] = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.none with Double = js.native
    
    /* 4 */ val roundAwayFromZero: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundAwayFromZero with Double = js.native
    
    /* 1 */ val roundDown: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundDown with Double = js.native
    
    /* 8 */ val roundHalfAwayFromZero: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfAwayFromZero with Double = js.native
    
    /* 5 */ val roundHalfDown: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfDown with Double = js.native
    
    /* 9 */ val roundHalfToEven: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToEven with Double = js.native
    
    /* 10 */ val roundHalfToOdd: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfToOdd with Double = js.native
    
    /* 7 */ val roundHalfTowardsZero: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfTowardsZero with Double = js.native
    
    /* 6 */ val roundHalfUp: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundHalfUp with Double = js.native
    
    /* 3 */ val roundTowardsZero: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundTowardsZero with Double = js.native
    
    /* 2 */ val roundUp: typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.RoundingAlgorithm.roundUp with Double = js.native
  }
  
  /** Rounds numbers to a specified number of significant digits. */
  @js.native
  /** Creates a SignificantDigitsNumberRounder object. */
  class SignificantDigitsNumberRounder ()
    extends typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting.SignificantDigitsNumberRounder
}
