package typingsSlinky.uifabricMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesheetMod {
  
  /* Inlined {  none :0,   insertNode :1,   appendChild :2}[keyof {  none :0,   insertNode :1,   appendChild :2}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
    - typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
    - typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
  */
  trait InjectionMode extends StObject
  object InjectionMode {
    
    @JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends rules using appendChild.
      */
    @JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode.appendChild")
    @js.native
    def appendChild: `2` = js.native
    @scala.inline
    def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
    
    /**
      * Inserts rules using the insertRule api.
      */
    @JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode.insertNode")
    @js.native
    def insertNode: `1` = js.native
    @scala.inline
    def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
    
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    @JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode.none")
    @js.native
    def none: `0` = js.native
    @scala.inline
    def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@uifabric/merge-styles/lib/Stylesheet", "Stylesheet")
  @js.native
  class Stylesheet () extends StObject {
    def this(config: IStyleSheetConfig) = this()
    
    var _classNameToArgs: js.Any = js.native
    
    var _config: js.Any = js.native
    
    var _counter: js.Any = js.native
    
    var _createStyleElement: js.Any = js.native
    
    var _findPlaceholderStyleTag: js.Any = js.native
    
    var _getStyleElement: js.Any = js.native
    
    var _keyToClassName: js.Any = js.native
    
    var _lastStyleElement: js.Any = js.native
    
    var _onResetCallbacks: js.Any = js.native
    
    var _preservedRules: js.Any = js.native
    
    var _rules: js.Any = js.native
    
    var _rulesToInsert: js.Any = js.native
    
    var _styleElement: js.Any = js.native
    
    /**
      * Gets the arguments associated with a given classname which was
      * previously registered using cacheClassName.
      */
    def argsFromClassName(className: String): js.UndefOr[js.Array[IStyle]] = js.native
    
    /**
      * Used internally to cache information about a class which was
      * registered with the stylesheet.
      */
    def cacheClassName(className: String, key: String, args: js.Array[IStyle], rules: js.Array[String]): Unit = js.native
    
    /**
      * Gets the appropriate classname given a key which was previously
      * registered using cacheClassName.
      */
    def classNameFromKey(key: String): js.UndefOr[String] = js.native
    
    /**
      * Generates a unique classname.
      *
      * @param displayName - Optional value to use as a prefix.
      */
    def getClassName(): String = js.native
    def getClassName(displayName: String): String = js.native
    
    /**
      * Gets all classnames cache with the stylesheet.
      */
    def getClassNameCache(): StringDictionary[String] = js.native
    
    /**
      * Gets all rules registered with the stylesheet; only valid when
      * using InsertionMode.none.
      */
    def getRules(): String = js.native
    def getRules(includePreservedRules: Boolean): String = js.native
    
    /**
      * Inserts a css rule into the stylesheet.
      * @param preserve - Preserves the rule beyond a reset boundary.
      */
    def insertRule(rule: String): Unit = js.native
    def insertRule(rule: String, preserve: Boolean): Unit = js.native
    
    /**
      * Gets the arguments associated with a given classname which was
      * previously registered using cacheClassName.
      */
    def insertedRulesFromClassName(className: String): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Configures a reset callback.
      *
      * @param callback - A callback which will be called when the Stylesheet is reset.
      */
    def onReset(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Resets the internal state of the stylesheet. Only used in server
      * rendered scenarios where we're using InsertionMode.none.
      */
    def reset(): Unit = js.native
    
    def resetKeys(): Unit = js.native
    
    /**
      * Configures the stylesheet.
      */
    def setConfig(): Unit = js.native
    def setConfig(config: IStyleSheetConfig): Unit = js.native
  }
  /* static members */
  object Stylesheet {
    
    /**
      * Gets the singleton instance.
      */
    @JSImport("@uifabric/merge-styles/lib/Stylesheet", "Stylesheet.getInstance")
    @js.native
    def getInstance(): Stylesheet = js.native
  }
  
  @js.native
  trait ICSPSettings extends StObject {
    
    /**
      * Nonce to inject into script tag
      */
    var nonce: js.UndefOr[String] = js.native
  }
  object ICSPSettings {
    
    @scala.inline
    def apply(): ICSPSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICSPSettings]
    }
    
    @scala.inline
    implicit class ICSPSettingsMutableBuilder[Self <: ICSPSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  @js.native
  trait IStyleSheetConfig extends StObject {
    
    /**
      * Initial value for classnames cache. Key is serialized css rules associated with a classname.
      */
    var classNameCache: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * CSP settings
      */
    var cspSettings: js.UndefOr[ICSPSettings] = js.native
    
    /**
      * Default 'displayName' to use for a className.
      * @defaultvalue 'css'
      */
    var defaultPrefix: js.UndefOr[String] = js.native
    
    /**
      * Injection mode for how rules are inserted.
      */
    var injectionMode: js.UndefOr[InjectionMode] = js.native
    
    /**
      * Default 'namespace' to attach before the className.
      */
    var namespace: js.UndefOr[String] = js.native
    
    /**
      * Callback executed when a rule is inserted.
      */
    var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.native
    
    /**
      * Defines the default direction of rules for auto-rtlifying things.
      * While typically this is represented as a DIR attribute in the markup,
      * the DIR is not enough to control whether padding goes on the left or
      * right. Use this to set the default direction when rules are registered.
      */
    var rtl: js.UndefOr[Boolean] = js.native
  }
  object IStyleSheetConfig {
    
    @scala.inline
    def apply(): IStyleSheetConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleSheetConfig]
    }
    
    @scala.inline
    implicit class IStyleSheetConfigMutableBuilder[Self <: IStyleSheetConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameCache(value: StringDictionary[String]): Self = StObject.set(x, "classNameCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameCacheUndefined: Self = StObject.set(x, "classNameCache", js.undefined)
      
      @scala.inline
      def setCspSettings(value: ICSPSettings): Self = StObject.set(x, "cspSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspSettingsUndefined: Self = StObject.set(x, "cspSettings", js.undefined)
      
      @scala.inline
      def setDefaultPrefix(value: String): Self = StObject.set(x, "defaultPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrefixUndefined: Self = StObject.set(x, "defaultPrefix", js.undefined)
      
      @scala.inline
      def setInjectionMode(value: InjectionMode): Self = StObject.set(x, "injectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectionModeUndefined: Self = StObject.set(x, "injectionMode", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setOnInsertRule(value: /* rule */ String => Unit): Self = StObject.set(x, "onInsertRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInsertRuleUndefined: Self = StObject.set(x, "onInsertRule", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
}
