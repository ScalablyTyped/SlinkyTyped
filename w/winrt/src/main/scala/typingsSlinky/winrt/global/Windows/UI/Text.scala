package typingsSlinky.winrt.global.Windows.UI

import typingsSlinky.winrt.Windows.UI.Color
import typingsSlinky.winrt.Windows.UI.Text.FontStretch
import typingsSlinky.winrt.Windows.UI.Text.FontStyle
import typingsSlinky.winrt.Windows.UI.Text.FontWeight
import typingsSlinky.winrt.Windows.UI.Text.IFontWeights
import typingsSlinky.winrt.Windows.UI.Text.TabLeader.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSGlobal("Windows.UI.Text.CaretType")
  @js.native
  object CaretType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.CaretType with Double] = js.native
    
    /* 0 */ val normal: typingsSlinky.winrt.Windows.UI.Text.CaretType.normal with Double = js.native
    
    /* 1 */ val null_ : typingsSlinky.winrt.Windows.UI.Text.CaretType.null_ with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FindOptions")
  @js.native
  object FindOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.FindOptions with Double] = js.native
    
    /* 2 */ val case_ : typingsSlinky.winrt.Windows.UI.Text.FindOptions.case_ with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.FindOptions.none with Double = js.native
    
    /* 1 */ val word: typingsSlinky.winrt.Windows.UI.Text.FindOptions.word with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStretch")
  @js.native
  object FontStretch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.FontStretch with Double] = js.native
    
    /* 3 */ val condensed: typingsSlinky.winrt.Windows.UI.Text.FontStretch.condensed with Double = js.native
    
    /* 7 */ val expanded: typingsSlinky.winrt.Windows.UI.Text.FontStretch.expanded with Double = js.native
    
    /* 2 */ val extraCondensed: typingsSlinky.winrt.Windows.UI.Text.FontStretch.extraCondensed with Double = js.native
    
    /* 8 */ val extraExpanded: typingsSlinky.winrt.Windows.UI.Text.FontStretch.extraExpanded with Double = js.native
    
    /* 5 */ val normal: typingsSlinky.winrt.Windows.UI.Text.FontStretch.normal with Double = js.native
    
    /* 4 */ val semiCondensed: typingsSlinky.winrt.Windows.UI.Text.FontStretch.semiCondensed with Double = js.native
    
    /* 6 */ val semiExpanded: typingsSlinky.winrt.Windows.UI.Text.FontStretch.semiExpanded with Double = js.native
    
    /* 1 */ val ultraCondensed: typingsSlinky.winrt.Windows.UI.Text.FontStretch.ultraCondensed with Double = js.native
    
    /* 9 */ val ultraExpanded: typingsSlinky.winrt.Windows.UI.Text.FontStretch.ultraExpanded with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.FontStretch.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.FontStyle with Double] = js.native
    
    /* 2 */ val italic: typingsSlinky.winrt.Windows.UI.Text.FontStyle.italic with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.winrt.Windows.UI.Text.FontStyle.normal with Double = js.native
    
    /* 1 */ val oblique: typingsSlinky.winrt.Windows.UI.Text.FontStyle.oblique with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.FontWeights")
  @js.native
  class FontWeights () extends IFontWeights
  /* static members */
  object FontWeights {
    
    @JSGlobal("Windows.UI.Text.FontWeights")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.FontWeights.black")
    @js.native
    def black: FontWeight = js.native
    @scala.inline
    def black_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.bold")
    @js.native
    def bold: FontWeight = js.native
    @scala.inline
    def bold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBlack")
    @js.native
    def extraBlack: FontWeight = js.native
    @scala.inline
    def extraBlack_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBlack")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraBold")
    @js.native
    def extraBold: FontWeight = js.native
    @scala.inline
    def extraBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.extraLight")
    @js.native
    def extraLight: FontWeight = js.native
    @scala.inline
    def extraLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.light")
    @js.native
    def light: FontWeight = js.native
    @scala.inline
    def light_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.medium")
    @js.native
    def medium: FontWeight = js.native
    @scala.inline
    def medium_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.normal")
    @js.native
    def normal: FontWeight = js.native
    @scala.inline
    def normal_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiBold")
    @js.native
    def semiBold: FontWeight = js.native
    @scala.inline
    def semiBold_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiBold")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.semiLight")
    @js.native
    def semiLight: FontWeight = js.native
    @scala.inline
    def semiLight_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semiLight")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.FontWeights.thin")
    @js.native
    def thin: FontWeight = js.native
    @scala.inline
    def thin_=(x: FontWeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thin")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.FormatEffect")
  @js.native
  object FormatEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.FormatEffect with Double] = js.native
    
    /* 0 */ val off: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.off with Double = js.native
    
    /* 1 */ val on: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.on with Double = js.native
    
    /* 2 */ val toggle: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.toggle with Double = js.native
    
    /* 3 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.FormatEffect.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
  @js.native
  object HorizontalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.HorizontalCharacterAlignment with Double] = js.native
    
    /* 2 */ val center: typingsSlinky.winrt.Windows.UI.Text.HorizontalCharacterAlignment.center with Double = js.native
    
    /* 0 */ val left: typingsSlinky.winrt.Windows.UI.Text.HorizontalCharacterAlignment.left with Double = js.native
    
    /* 1 */ val right: typingsSlinky.winrt.Windows.UI.Text.HorizontalCharacterAlignment.right with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LetterCase")
  @js.native
  object LetterCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.LetterCase with Double] = js.native
    
    /* 0 */ val lower: typingsSlinky.winrt.Windows.UI.Text.LetterCase.lower with Double = js.native
    
    /* 1 */ val upper: typingsSlinky.winrt.Windows.UI.Text.LetterCase.upper with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LineSpacingRule")
  @js.native
  object LineSpacingRule extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule with Double] = js.native
    
    /* 4 */ val atLeast: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.atLeast with Double = js.native
    
    /* 3 */ val double: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.double with Double = js.native
    
    /* 5 */ val exactly: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.exactly with Double = js.native
    
    /* 6 */ val multiple: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.multiple with Double = js.native
    
    /* 2 */ val oneAndHalf: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.oneAndHalf with Double = js.native
    
    /* 7 */ val percent: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.percent with Double = js.native
    
    /* 1 */ val single: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.single with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.LineSpacingRule.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.LinkType with Double] = js.native
    
    /* 5 */ val autoLink: typingsSlinky.winrt.Windows.UI.Text.LinkType.autoLink with Double = js.native
    
    /* 6 */ val autoLinkEmail: typingsSlinky.winrt.Windows.UI.Text.LinkType.autoLinkEmail with Double = js.native
    
    /* 8 */ val autoLinkPath: typingsSlinky.winrt.Windows.UI.Text.LinkType.autoLinkPath with Double = js.native
    
    /* 7 */ val autoLinkPhone: typingsSlinky.winrt.Windows.UI.Text.LinkType.autoLinkPhone with Double = js.native
    
    /* 2 */ val clientLink: typingsSlinky.winrt.Windows.UI.Text.LinkType.clientLink with Double = js.native
    
    /* 4 */ val friendlyLinkAddress: typingsSlinky.winrt.Windows.UI.Text.LinkType.friendlyLinkAddress with Double = js.native
    
    /* 3 */ val friendlyLinkName: typingsSlinky.winrt.Windows.UI.Text.LinkType.friendlyLinkName with Double = js.native
    
    /* 1 */ val notALink: typingsSlinky.winrt.Windows.UI.Text.LinkType.notALink with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.LinkType.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerAlignment")
  @js.native
  object MarkerAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.MarkerAlignment with Double] = js.native
    
    /* 2 */ val center: typingsSlinky.winrt.Windows.UI.Text.MarkerAlignment.center with Double = js.native
    
    /* 1 */ val left: typingsSlinky.winrt.Windows.UI.Text.MarkerAlignment.left with Double = js.native
    
    /* 3 */ val right: typingsSlinky.winrt.Windows.UI.Text.MarkerAlignment.right with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.MarkerAlignment.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerStyle")
  @js.native
  object MarkerStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.MarkerStyle with Double] = js.native
    
    /* 5 */ val minus: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.minus with Double = js.native
    
    /* 6 */ val noNumber: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.noNumber with Double = js.native
    
    /* 2 */ val parentheses: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.parentheses with Double = js.native
    
    /* 1 */ val parenthesis: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.parenthesis with Double = js.native
    
    /* 3 */ val period: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.period with Double = js.native
    
    /* 4 */ val plain: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.plain with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.MarkerStyle.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.MarkerType")
  @js.native
  object MarkerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.MarkerType with Double] = js.native
    
    /* 3 */ val arabic: typingsSlinky.winrt.Windows.UI.Text.MarkerType.arabic with Double = js.native
    
    /* 18 */ val arabicAbjad: typingsSlinky.winrt.Windows.UI.Text.MarkerType.arabicAbjad with Double = js.native
    
    /* 17 */ val arabicDictionary: typingsSlinky.winrt.Windows.UI.Text.MarkerType.arabicDictionary with Double = js.native
    
    /* 12 */ val arabicWide: typingsSlinky.winrt.Windows.UI.Text.MarkerType.arabicWide with Double = js.native
    
    /* 10 */ val blackCircleWingding: typingsSlinky.winrt.Windows.UI.Text.MarkerType.blackCircleWingding with Double = js.native
    
    /* 2 */ val bullet: typingsSlinky.winrt.Windows.UI.Text.MarkerType.bullet with Double = js.native
    
    /* 9 */ val circledNumber: typingsSlinky.winrt.Windows.UI.Text.MarkerType.circledNumber with Double = js.native
    
    /* 23 */ val devanagariConsonant: typingsSlinky.winrt.Windows.UI.Text.MarkerType.devanagariConsonant with Double = js.native
    
    /* 24 */ val devanagariNumeric: typingsSlinky.winrt.Windows.UI.Text.MarkerType.devanagariNumeric with Double = js.native
    
    /* 22 */ val devanagariVowel: typingsSlinky.winrt.Windows.UI.Text.MarkerType.devanagariVowel with Double = js.native
    
    /* 19 */ val hebrew: typingsSlinky.winrt.Windows.UI.Text.MarkerType.hebrew with Double = js.native
    
    /* 16 */ val japanKorea: typingsSlinky.winrt.Windows.UI.Text.MarkerType.japanKorea with Double = js.native
    
    /* 15 */ val japanSimplifiedChinese: typingsSlinky.winrt.Windows.UI.Text.MarkerType.japanSimplifiedChinese with Double = js.native
    
    /* 4 */ val lowercaseEnglishLetter: typingsSlinky.winrt.Windows.UI.Text.MarkerType.lowercaseEnglishLetter with Double = js.native
    
    /* 6 */ val lowercaseRoman: typingsSlinky.winrt.Windows.UI.Text.MarkerType.lowercaseRoman with Double = js.native
    
    /* 1 */ val none: typingsSlinky.winrt.Windows.UI.Text.MarkerType.none with Double = js.native
    
    /* 13 */ val simplifiedChinese: typingsSlinky.winrt.Windows.UI.Text.MarkerType.simplifiedChinese with Double = js.native
    
    /* 20 */ val thaiAlphabetic: typingsSlinky.winrt.Windows.UI.Text.MarkerType.thaiAlphabetic with Double = js.native
    
    /* 21 */ val thaiNumeric: typingsSlinky.winrt.Windows.UI.Text.MarkerType.thaiNumeric with Double = js.native
    
    /* 14 */ val traditionalChinese: typingsSlinky.winrt.Windows.UI.Text.MarkerType.traditionalChinese with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.MarkerType.undefined with Double = js.native
    
    /* 8 */ val unicodeSequence: typingsSlinky.winrt.Windows.UI.Text.MarkerType.unicodeSequence with Double = js.native
    
    /* 5 */ val uppercaseEnglishLetter: typingsSlinky.winrt.Windows.UI.Text.MarkerType.uppercaseEnglishLetter with Double = js.native
    
    /* 7 */ val uppercaseRoman: typingsSlinky.winrt.Windows.UI.Text.MarkerType.uppercaseRoman with Double = js.native
    
    /* 11 */ val whiteCircleWingding: typingsSlinky.winrt.Windows.UI.Text.MarkerType.whiteCircleWingding with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment with Double] = js.native
    
    /* 2 */ val center: typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment.center with Double = js.native
    
    /* 4 */ val justify: typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment.justify with Double = js.native
    
    /* 1 */ val left: typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment.left with Double = js.native
    
    /* 3 */ val right: typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment.right with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.ParagraphAlignment.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.ParagraphStyle")
  @js.native
  object ParagraphStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle with Double] = js.native
    
    /* 3 */ val heading1: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading1 with Double = js.native
    
    /* 4 */ val heading2: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading2 with Double = js.native
    
    /* 5 */ val heading3: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading3 with Double = js.native
    
    /* 6 */ val heading4: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading4 with Double = js.native
    
    /* 7 */ val heading5: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading5 with Double = js.native
    
    /* 8 */ val heading6: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading6 with Double = js.native
    
    /* 9 */ val heading7: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading7 with Double = js.native
    
    /* 10 */ val heading8: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading8 with Double = js.native
    
    /* 11 */ val heading9: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.heading9 with Double = js.native
    
    /* 1 */ val none: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.none with Double = js.native
    
    /* 2 */ val normal: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.normal with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.ParagraphStyle.undefined with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.PointOptions")
  @js.native
  object PointOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.PointOptions with Double] = js.native
    
    /* 4 */ val allowOffClient: typingsSlinky.winrt.Windows.UI.Text.PointOptions.allowOffClient with Double = js.native
    
    /* 3 */ val clientCoordinates: typingsSlinky.winrt.Windows.UI.Text.PointOptions.clientCoordinates with Double = js.native
    
    /* 1 */ val includeInset: typingsSlinky.winrt.Windows.UI.Text.PointOptions.includeInset with Double = js.native
    
    /* 6 */ val noHorizontalScroll: typingsSlinky.winrt.Windows.UI.Text.PointOptions.noHorizontalScroll with Double = js.native
    
    /* 7 */ val noVerticalScroll: typingsSlinky.winrt.Windows.UI.Text.PointOptions.noVerticalScroll with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.PointOptions.none with Double = js.native
    
    /* 2 */ val start: typingsSlinky.winrt.Windows.UI.Text.PointOptions.start with Double = js.native
    
    /* 5 */ val transform: typingsSlinky.winrt.Windows.UI.Text.PointOptions.transform with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.RangeGravity")
  @js.native
  object RangeGravity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.RangeGravity with Double] = js.native
    
    /* 1 */ val backward: typingsSlinky.winrt.Windows.UI.Text.RangeGravity.backward with Double = js.native
    
    /* 2 */ val forward: typingsSlinky.winrt.Windows.UI.Text.RangeGravity.forward with Double = js.native
    
    /* 3 */ val inward: typingsSlinky.winrt.Windows.UI.Text.RangeGravity.inward with Double = js.native
    
    /* 4 */ val outward: typingsSlinky.winrt.Windows.UI.Text.RangeGravity.outward with Double = js.native
    
    /* 0 */ val uIBehavior: typingsSlinky.winrt.Windows.UI.Text.RangeGravity.uIBehavior with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionOptions")
  @js.native
  object SelectionOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.SelectionOptions with Double] = js.native
    
    /* 3 */ val active: typingsSlinky.winrt.Windows.UI.Text.SelectionOptions.active with Double = js.native
    
    /* 1 */ val atEndOfLine: typingsSlinky.winrt.Windows.UI.Text.SelectionOptions.atEndOfLine with Double = js.native
    
    /* 2 */ val overtype: typingsSlinky.winrt.Windows.UI.Text.SelectionOptions.overtype with Double = js.native
    
    /* 4 */ val replace: typingsSlinky.winrt.Windows.UI.Text.SelectionOptions.replace with Double = js.native
    
    /* 0 */ val startActive: typingsSlinky.winrt.Windows.UI.Text.SelectionOptions.startActive with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.SelectionType with Double] = js.native
    
    /* 3 */ val inlineShape: typingsSlinky.winrt.Windows.UI.Text.SelectionType.inlineShape with Double = js.native
    
    /* 1 */ val insertionPoint: typingsSlinky.winrt.Windows.UI.Text.SelectionType.insertionPoint with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.SelectionType.none with Double = js.native
    
    /* 2 */ val normal: typingsSlinky.winrt.Windows.UI.Text.SelectionType.normal with Double = js.native
    
    /* 4 */ val shape: typingsSlinky.winrt.Windows.UI.Text.SelectionType.shape with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabAlignment")
  @js.native
  object TabAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TabAlignment with Double] = js.native
    
    /* 4 */ val bar: typingsSlinky.winrt.Windows.UI.Text.TabAlignment.bar with Double = js.native
    
    /* 1 */ val center: typingsSlinky.winrt.Windows.UI.Text.TabAlignment.center with Double = js.native
    
    /* 3 */ val decimal: typingsSlinky.winrt.Windows.UI.Text.TabAlignment.decimal with Double = js.native
    
    /* 0 */ val left: typingsSlinky.winrt.Windows.UI.Text.TabAlignment.left with Double = js.native
    
    /* 2 */ val right: typingsSlinky.winrt.Windows.UI.Text.TabAlignment.right with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TabLeader")
  @js.native
  object TabLeader extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TabLeader with Double] = js.native
    
    /* 2 */ val dashes: typingsSlinky.winrt.Windows.UI.Text.TabLeader.dashes with Double = js.native
    
    /* 1 */ val dots: typingsSlinky.winrt.Windows.UI.Text.TabLeader.dots with Double = js.native
    
    /* 5 */ @JSName("equals")
    val equals_ : equals with Double = js.native
    
    /* 3 */ val lines: typingsSlinky.winrt.Windows.UI.Text.TabLeader.lines with Double = js.native
    
    /* 0 */ val spaces: typingsSlinky.winrt.Windows.UI.Text.TabLeader.spaces with Double = js.native
    
    /* 4 */ val thickLines: typingsSlinky.winrt.Windows.UI.Text.TabLeader.thickLines with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextConstants")
  @js.native
  class TextConstants ()
    extends typingsSlinky.winrt.Windows.UI.Text.TextConstants
  /* static members */
  object TextConstants {
    
    @JSGlobal("Windows.UI.Text.TextConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Text.TextConstants.autoColor")
    @js.native
    def autoColor: Color = js.native
    @scala.inline
    def autoColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.maxUnitCount")
    @js.native
    def maxUnitCount: Double = js.native
    @scala.inline
    def maxUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.minUnitCount")
    @js.native
    def minUnitCount: Double = js.native
    @scala.inline
    def minUnitCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minUnitCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedColor")
    @js.native
    def undefinedColor: Color = js.native
    @scala.inline
    def undefinedColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedColor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFloatValue")
    @js.native
    def undefinedFloatValue: Double = js.native
    @scala.inline
    def undefinedFloatValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFloatValue")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStretch")
    @js.native
    def undefinedFontStretch: FontStretch = js.native
    @scala.inline
    def undefinedFontStretch_=(x: FontStretch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStretch")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedFontStyle")
    @js.native
    def undefinedFontStyle: FontStyle = js.native
    @scala.inline
    def undefinedFontStyle_=(x: FontStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedFontStyle")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.UI.Text.TextConstants.undefinedInt32Value")
    @js.native
    def undefinedInt32Value: Double = js.native
    @scala.inline
    def undefinedInt32Value_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedInt32Value")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Text.TextGetOptions")
  @js.native
  object TextGetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TextGetOptions with Double] = js.native
    
    /* 1 */ val adjustCrlf: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.adjustCrlf with Double = js.native
    
    /* 4 */ val allowFinalEop: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.allowFinalEop with Double = js.native
    
    /* 7 */ val formatRtf: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.formatRtf with Double = js.native
    
    /* 6 */ val includeNumbering: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.includeNumbering with Double = js.native
    
    /* 5 */ val noHidden: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.noHidden with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.none with Double = js.native
    
    /* 2 */ val useCrlf: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.useCrlf with Double = js.native
    
    /* 3 */ val useObjectText: typingsSlinky.winrt.Windows.UI.Text.TextGetOptions.useObjectText with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextRangeUnit")
  @js.native
  object TextRangeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit with Double] = js.native
    
    /* 21 */ val allCaps: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.allCaps with Double = js.native
    
    /* 14 */ val bold: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.bold with Double = js.native
    
    /* 0 */ val character: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.character with Double = js.native
    
    /* 9 */ val characterFormat: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.characterFormat with Double = js.native
    
    /* 13 */ val cluster: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.cluster with Double = js.native
    
    /* 26 */ val disabled: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.disabled with Double = js.native
    
    /* 30 */ val fontBound: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.fontBound with Double = js.native
    
    /* 12 */ val hardParagraph: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.hardParagraph with Double = js.native
    
    /* 22 */ val hidden: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.hidden with Double = js.native
    
    /* 25 */ val imprint: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.imprint with Double = js.native
    
    /* 15 */ val italic: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.italic with Double = js.native
    
    /* 4 */ val line: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.line with Double = js.native
    
    /* 19 */ val link: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.link with Double = js.native
    
    /* 31 */ val linkProtected: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.linkProtected with Double = js.native
    
    /* 11 */ val `object`: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.`object` with Double = js.native
    
    /* 23 */ val outline: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.outline with Double = js.native
    
    /* 3 */ val paragraph: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.paragraph with Double = js.native
    
    /* 10 */ val paragraphFormat: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.paragraphFormat with Double = js.native
    
    /* 18 */ val protectedText: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.protectedText with Double = js.native
    
    /* 27 */ val revised: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.revised with Double = js.native
    
    /* 6 */ val screen: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.screen with Double = js.native
    
    /* 7 */ val section: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.section with Double = js.native
    
    /* 2 */ val sentence: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.sentence with Double = js.native
    
    /* 24 */ val shadow: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.shadow with Double = js.native
    
    /* 20 */ val smallCaps: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.smallCaps with Double = js.native
    
    /* 5 */ val story: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.story with Double = js.native
    
    /* 17 */ val strikethrough: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.strikethrough with Double = js.native
    
    /* 28 */ val subscript: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.subscript with Double = js.native
    
    /* 29 */ val superscript: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.superscript with Double = js.native
    
    /* 16 */ val underline: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.underline with Double = js.native
    
    /* 8 */ val window: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.window with Double = js.native
    
    /* 1 */ val word: typingsSlinky.winrt.Windows.UI.Text.TextRangeUnit.word with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextScript")
  @js.native
  object TextScript extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TextScript with Double] = js.native
    
    /* 10 */ val default: typingsSlinky.winrt.Windows.UI.Text.TextScript.default with Double = js.native
    
    /* 40 */ val aboriginal: typingsSlinky.winrt.Windows.UI.Text.TextScript.aboriginal with Double = js.native
    
    /* 1 */ val ansi: typingsSlinky.winrt.Windows.UI.Text.TextScript.ansi with Double = js.native
    
    /* 7 */ val arabic: typingsSlinky.winrt.Windows.UI.Text.TextScript.arabic with Double = js.native
    
    /* 20 */ val armenian: typingsSlinky.winrt.Windows.UI.Text.TextScript.armenian with Double = js.native
    
    /* 8 */ val baltic: typingsSlinky.winrt.Windows.UI.Text.TextScript.baltic with Double = js.native
    
    /* 24 */ val bengali: typingsSlinky.winrt.Windows.UI.Text.TextScript.bengali with Double = js.native
    
    /* 16 */ val big5: typingsSlinky.winrt.Windows.UI.Text.TextScript.big5 with Double = js.native
    
    /* 45 */ val braille: typingsSlinky.winrt.Windows.UI.Text.TextScript.braille with Double = js.native
    
    /* 39 */ val cherokee: typingsSlinky.winrt.Windows.UI.Text.TextScript.cherokee with Double = js.native
    
    /* 3 */ val cyrillic: typingsSlinky.winrt.Windows.UI.Text.TextScript.cyrillic with Double = js.native
    
    /* 62 */ val deseret: typingsSlinky.winrt.Windows.UI.Text.TextScript.deseret with Double = js.native
    
    /* 23 */ val devanagari: typingsSlinky.winrt.Windows.UI.Text.TextScript.devanagari with Double = js.native
    
    /* 2 */ val eastEurope: typingsSlinky.winrt.Windows.UI.Text.TextScript.eastEurope with Double = js.native
    
    /* 54 */ val emoji: typingsSlinky.winrt.Windows.UI.Text.TextScript.emoji with Double = js.native
    
    /* 38 */ val ethiopic: typingsSlinky.winrt.Windows.UI.Text.TextScript.ethiopic with Double = js.native
    
    /* 14 */ val gB2312: typingsSlinky.winrt.Windows.UI.Text.TextScript.gB2312 with Double = js.native
    
    /* 36 */ val georgian: typingsSlinky.winrt.Windows.UI.Text.TextScript.georgian with Double = js.native
    
    /* 55 */ val glagolitic: typingsSlinky.winrt.Windows.UI.Text.TextScript.glagolitic with Double = js.native
    
    /* 61 */ val gothic: typingsSlinky.winrt.Windows.UI.Text.TextScript.gothic with Double = js.native
    
    /* 4 */ val greek: typingsSlinky.winrt.Windows.UI.Text.TextScript.greek with Double = js.native
    
    /* 26 */ val gujarati: typingsSlinky.winrt.Windows.UI.Text.TextScript.gujarati with Double = js.native
    
    /* 25 */ val gurmukhi: typingsSlinky.winrt.Windows.UI.Text.TextScript.gurmukhi with Double = js.native
    
    /* 15 */ val hangul: typingsSlinky.winrt.Windows.UI.Text.TextScript.hangul with Double = js.native
    
    /* 6 */ val hebrew: typingsSlinky.winrt.Windows.UI.Text.TextScript.hebrew with Double = js.native
    
    /* 37 */ val jamo: typingsSlinky.winrt.Windows.UI.Text.TextScript.jamo with Double = js.native
    
    /* 30 */ val kannada: typingsSlinky.winrt.Windows.UI.Text.TextScript.kannada with Double = js.native
    
    /* 52 */ val kayahli: typingsSlinky.winrt.Windows.UI.Text.TextScript.kayahli with Double = js.native
    
    /* 51 */ val kharoshthi: typingsSlinky.winrt.Windows.UI.Text.TextScript.kharoshthi with Double = js.native
    
    /* 43 */ val khmer: typingsSlinky.winrt.Windows.UI.Text.TextScript.khmer with Double = js.native
    
    /* 33 */ val lao: typingsSlinky.winrt.Windows.UI.Text.TextScript.lao with Double = js.native
    
    /* 47 */ val limbu: typingsSlinky.winrt.Windows.UI.Text.TextScript.limbu with Double = js.native
    
    /* 56 */ val lisu: typingsSlinky.winrt.Windows.UI.Text.TextScript.lisu with Double = js.native
    
    /* 19 */ val mac: typingsSlinky.winrt.Windows.UI.Text.TextScript.mac with Double = js.native
    
    /* 31 */ val malayalam: typingsSlinky.winrt.Windows.UI.Text.TextScript.malayalam with Double = js.native
    
    /* 44 */ val mongolian: typingsSlinky.winrt.Windows.UI.Text.TextScript.mongolian with Double = js.native
    
    /* 35 */ val myanmar: typingsSlinky.winrt.Windows.UI.Text.TextScript.myanmar with Double = js.native
    
    /* 58 */ val nKo: typingsSlinky.winrt.Windows.UI.Text.TextScript.nKo with Double = js.native
    
    /* 49 */ val newTaiLue: typingsSlinky.winrt.Windows.UI.Text.TextScript.newTaiLue with Double = js.native
    
    /* 18 */ val oem: typingsSlinky.winrt.Windows.UI.Text.TextScript.oem with Double = js.native
    
    /* 41 */ val ogham: typingsSlinky.winrt.Windows.UI.Text.TextScript.ogham with Double = js.native
    
    /* 27 */ val oriya: typingsSlinky.winrt.Windows.UI.Text.TextScript.oriya with Double = js.native
    
    /* 59 */ val osmanya: typingsSlinky.winrt.Windows.UI.Text.TextScript.osmanya with Double = js.native
    
    /* 17 */ val pC437: typingsSlinky.winrt.Windows.UI.Text.TextScript.pC437 with Double = js.native
    
    /* 60 */ val phagsPa: typingsSlinky.winrt.Windows.UI.Text.TextScript.phagsPa with Double = js.native
    
    /* 42 */ val runic: typingsSlinky.winrt.Windows.UI.Text.TextScript.runic with Double = js.native
    
    /* 13 */ val shiftJis: typingsSlinky.winrt.Windows.UI.Text.TextScript.shiftJis with Double = js.native
    
    /* 32 */ val sinhala: typingsSlinky.winrt.Windows.UI.Text.TextScript.sinhala with Double = js.native
    
    /* 50 */ val sylotiNagri: typingsSlinky.winrt.Windows.UI.Text.TextScript.sylotiNagri with Double = js.native
    
    /* 11 */ val symbol: typingsSlinky.winrt.Windows.UI.Text.TextScript.symbol with Double = js.native
    
    /* 21 */ val syriac: typingsSlinky.winrt.Windows.UI.Text.TextScript.syriac with Double = js.native
    
    /* 48 */ val taiLe: typingsSlinky.winrt.Windows.UI.Text.TextScript.taiLe with Double = js.native
    
    /* 28 */ val tamil: typingsSlinky.winrt.Windows.UI.Text.TextScript.tamil with Double = js.native
    
    /* 29 */ val telugu: typingsSlinky.winrt.Windows.UI.Text.TextScript.telugu with Double = js.native
    
    /* 22 */ val thaana: typingsSlinky.winrt.Windows.UI.Text.TextScript.thaana with Double = js.native
    
    /* 12 */ val thai: typingsSlinky.winrt.Windows.UI.Text.TextScript.thai with Double = js.native
    
    /* 34 */ val tibetan: typingsSlinky.winrt.Windows.UI.Text.TextScript.tibetan with Double = js.native
    
    /* 63 */ val tifinagh: typingsSlinky.winrt.Windows.UI.Text.TextScript.tifinagh with Double = js.native
    
    /* 5 */ val turkish: typingsSlinky.winrt.Windows.UI.Text.TextScript.turkish with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.TextScript.undefined with Double = js.native
    
    /* 53 */ val unicodeSymbol: typingsSlinky.winrt.Windows.UI.Text.TextScript.unicodeSymbol with Double = js.native
    
    /* 57 */ val vai: typingsSlinky.winrt.Windows.UI.Text.TextScript.vai with Double = js.native
    
    /* 9 */ val vietnamese: typingsSlinky.winrt.Windows.UI.Text.TextScript.vietnamese with Double = js.native
    
    /* 46 */ val yi: typingsSlinky.winrt.Windows.UI.Text.TextScript.yi with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.TextSetOptions")
  @js.native
  object TextSetOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.TextSetOptions with Double] = js.native
    
    /* 6 */ val applyRtfDocumentDefaults: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.applyRtfDocumentDefaults with Double = js.native
    
    /* 4 */ val checkTextLimit: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.checkTextLimit with Double = js.native
    
    /* 5 */ val formatRtf: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.formatRtf with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.none with Double = js.native
    
    /* 3 */ val unhide: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.unhide with Double = js.native
    
    /* 1 */ val unicodeBidi: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.unicodeBidi with Double = js.native
    
    /* 2 */ val unlink: typingsSlinky.winrt.Windows.UI.Text.TextSetOptions.unlink with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.UnderlineType")
  @js.native
  object UnderlineType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.UnderlineType with Double] = js.native
    
    /* 6 */ val dash: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.dash with Double = js.native
    
    /* 7 */ val dashDot: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.dashDot with Double = js.native
    
    /* 8 */ val dashDotDot: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.dashDotDot with Double = js.native
    
    /* 5 */ val dotted: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.dotted with Double = js.native
    
    /* 4 */ val double: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.double with Double = js.native
    
    /* 12 */ val doubleWave: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.doubleWave with Double = js.native
    
    /* 13 */ val heavyWave: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.heavyWave with Double = js.native
    
    /* 14 */ val longDash: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.longDash with Double = js.native
    
    /* 1 */ val none: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.none with Double = js.native
    
    /* 2 */ val single: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.single with Double = js.native
    
    /* 10 */ val thick: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thick with Double = js.native
    
    /* 15 */ val thickDash: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thickDash with Double = js.native
    
    /* 16 */ val thickDashDot: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thickDashDot with Double = js.native
    
    /* 17 */ val thickDashDotDot: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thickDashDotDot with Double = js.native
    
    /* 18 */ val thickDotted: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thickDotted with Double = js.native
    
    /* 19 */ val thickLongDash: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thickLongDash with Double = js.native
    
    /* 11 */ val thin: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.thin with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.undefined with Double = js.native
    
    /* 9 */ val wave: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.wave with Double = js.native
    
    /* 3 */ val words: typingsSlinky.winrt.Windows.UI.Text.UnderlineType.words with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
  @js.native
  object VerticalCharacterAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Text.VerticalCharacterAlignment with Double] = js.native
    
    /* 1 */ val baseline: typingsSlinky.winrt.Windows.UI.Text.VerticalCharacterAlignment.baseline with Double = js.native
    
    /* 2 */ val bottom: typingsSlinky.winrt.Windows.UI.Text.VerticalCharacterAlignment.bottom with Double = js.native
    
    /* 0 */ val top: typingsSlinky.winrt.Windows.UI.Text.VerticalCharacterAlignment.top with Double = js.native
  }
}
