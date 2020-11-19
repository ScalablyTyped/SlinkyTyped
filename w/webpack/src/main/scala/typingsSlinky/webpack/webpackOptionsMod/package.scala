package typingsSlinky.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webpackOptionsMod {
  
  type ArrayOfStringOrStringArrayValues = js.Array[java.lang.String | js.Array[java.lang.String]]
  
  type ArrayOfStringValues = js.Array[java.lang.String]
  
  type Entry = typingsSlinky.webpack.webpackOptionsMod.EntryDynamic | typingsSlinky.webpack.webpackOptionsMod.EntryStatic
  
  type EntryDynamic = js.Function0[
    typingsSlinky.webpack.webpackOptionsMod.EntryStatic | js.Promise[typingsSlinky.webpack.webpackOptionsMod.EntryStatic]
  ]
  
  type EntryItem = java.lang.String | typingsSlinky.webpack.webpackOptionsMod.NonEmptyArrayOfUniqueStringValues
  
  type EntryObject = /**
  	 * An entry point with name
  	 */
  org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsSlinky.webpack.webpackOptionsMod.NonEmptyArrayOfUniqueStringValues
  ]
  
  type EntryStatic = typingsSlinky.webpack.webpackOptionsMod.EntryObject | typingsSlinky.webpack.webpackOptionsMod.EntryItem
  
  type ExternalItem = java.lang.String | (/**
  			 * The dependency used for the external
  			 */
  org.scalablytyped.runtime.StringDictionary[
    java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | typingsSlinky.webpack.webpackOptionsMod.ArrayOfStringValues | scala.Boolean
  ]) | js.RegExp
  
  type Externals = (js.Function3[
    /* context */ java.lang.String, 
    /* request */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[js.Error], 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]) | typingsSlinky.webpack.webpackOptionsMod.ExternalItem | (js.Array[
    (js.Function3[
      /* context */ java.lang.String, 
      /* request */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[js.Error], 
        /* result */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]) | typingsSlinky.webpack.webpackOptionsMod.ExternalItem
  ])
  
  type FilterItemTypes = js.RegExp | java.lang.String | (js.Function1[/* value */ java.lang.String, scala.Boolean])
  
  type FilterTypes = typingsSlinky.webpack.webpackOptionsMod.FilterItemTypes | js.Array[typingsSlinky.webpack.webpackOptionsMod.FilterItemTypes]
  
  type NonEmptyArrayOfUniqueStringValues = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.RegExp
    - java.lang.String
    - js.Function1[/ * value * / java.lang.String, scala.Boolean]
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetConditions
    - typingsSlinky.webpack.anon.And
  */
  type RuleSetCondition = typingsSlinky.webpack.webpackOptionsMod._RuleSetCondition | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.RegExp
    - java.lang.String
    - js.Function1[/ * value * / java.lang.String, scala.Boolean]
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
    - typingsSlinky.webpack.anon.Exclude
  */
  type RuleSetConditionAbsolute = typingsSlinky.webpack.webpackOptionsMod._RuleSetConditionAbsolute | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetCondition
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetConditions
  */
  type RuleSetConditionOrConditions = typingsSlinky.webpack.webpackOptionsMod._RuleSetConditionOrConditions | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetConditionAbsolute
    - typingsSlinky.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
  */
  type RuleSetConditionOrConditionsAbsolute = typingsSlinky.webpack.webpackOptionsMod._RuleSetConditionOrConditionsAbsolute | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  
  type RuleSetLoader = java.lang.String
  
  type RuleSetQuery = org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String
  
  type RuleSetRules = js.Array[typingsSlinky.webpack.webpackOptionsMod.RuleSetRule]
  
  type RuleSetUse = typingsSlinky.webpack.webpackOptionsMod.RuleSetUseItem | js.Function | js.Array[typingsSlinky.webpack.webpackOptionsMod.RuleSetUseItem]
  
  type RuleSetUseItem = typingsSlinky.webpack.webpackOptionsMod.RuleSetLoader | js.Function | typingsSlinky.webpack.anon.Ident
  
  type WebpackPluginFunction = js.ThisFunction1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* this */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any, 
    scala.Unit
  ]
}
