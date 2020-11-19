package typingsSlinky.webpackMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigurationMergeConfigFunction = js.Function1[
    /* customizeOptions */ typingsSlinky.webpackMerge.mod.CustomizeOptions, 
    typingsSlinky.webpackMerge.mod.ConfigurationMergeFunction
  ]
  
  type ConfigurationMergeFunction = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ /* repeated */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ]
  
  type CustomizeArrayFunction = js.Function3[
    /* a */ js.Array[js.Any], 
    /* b */ js.Array[js.Any], 
    /* key */ java.lang.String, 
    js.UndefOr[js.Array[js.Any] | scala.Null]
  ]
  
  type CustomizeObjectFunction = js.Function3[
    /* a */ js.Object, 
    /* b */ js.Object, 
    /* key */ java.lang.String, 
    js.UndefOr[js.Object | scala.Null]
  ]
  
  type MergeFunction = typingsSlinky.webpackMerge.mod.ConfigurationMergeFunction | typingsSlinky.webpackMerge.mod.ConfigurationMergeConfigFunction
  
  type MultipleConfiguration = org.scalablytyped.runtime.StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
  ]
  
  type MultipleConfigurationMergeFunction = js.Function1[
    /* repeated */ typingsSlinky.webpackMerge.mod.MultipleConfiguration, 
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ]
  ]
  
  type UniqueFunction = js.Function3[
    /* field */ java.lang.String, 
    /* fields */ js.Array[java.lang.String], 
    /* keyFn */ js.Function1[/* field */ js.Any, java.lang.String], 
    typingsSlinky.webpackMerge.mod.CustomizeArrayFunction
  ]
}
