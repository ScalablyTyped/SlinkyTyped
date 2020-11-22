package typingsSlinky.vueCompilerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BindingMetadata = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.data | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.props | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.setup | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.options
  ]
  
  type CompilerOptions = typingsSlinky.vueCompilerCore.mod.ParserOptions with typingsSlinky.vueCompilerCore.mod.TransformOptions with typingsSlinky.vueCompilerCore.mod.CodegenOptions
  
  type DirectiveTransform = js.Function4[
    /* dir */ typingsSlinky.vueCompilerCore.mod.DirectiveNode, 
    /* node */ typingsSlinky.vueCompilerCore.mod.ElementNode, 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    /* augmentor */ js.UndefOr[
      js.Function1[
        /* ret */ typingsSlinky.vueCompilerCore.mod.DirectiveTransformResult, 
        typingsSlinky.vueCompilerCore.mod.DirectiveTransformResult
      ]
    ], 
    typingsSlinky.vueCompilerCore.mod.DirectiveTransformResult
  ]
  
  type HoistTransform = js.Function3[
    /* children */ js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode], 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    /* parent */ typingsSlinky.vueCompilerCore.mod.ParentNode2, 
    scala.Unit
  ]
  
  type Namespace = scala.Double
  
  type Namespaces = typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`0`
  
  type NodeTransform = js.Function2[
    /* node */ typingsSlinky.vueCompilerCore.mod.RootNode | typingsSlinky.vueCompilerCore.mod.TemplateChildNode, 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    scala.Unit | js.Function0[scala.Unit] | js.Array[js.Function0[scala.Unit]]
  ]
  
  type SlotFnBuilder = js.Function3[
    /* slotProps */ js.UndefOr[typingsSlinky.vueCompilerCore.mod.ExpressionNode], 
    /* slotChildren */ js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode], 
    /* loc */ typingsSlinky.vueCompilerCore.mod.SourceLocation, 
    typingsSlinky.vueCompilerCore.mod.FunctionExpression
  ]
  
  type StructuralDirectiveTransform = js.Function3[
    /* node */ typingsSlinky.vueCompilerCore.mod.ElementNode, 
    /* dir */ typingsSlinky.vueCompilerCore.mod.DirectiveNode, 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    scala.Unit | js.Function0[scala.Unit]
  ]
  
  type TransformPreset = js.Tuple2[
    js.Array[typingsSlinky.vueCompilerCore.mod.NodeTransform], 
    typingsSlinky.std.Record[java.lang.String, typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  ]
}
