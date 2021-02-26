package typingsSlinky.vueCompilerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def BASE_TRANSITION: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BASE_TRANSITION").asInstanceOf[js.Symbol]
  
  type BindingMetadata = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.data | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.props | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.setup | typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.options
  ]
  
  @scala.inline
  def CAMELIZE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CAMELIZE").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CAPITALIZE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CAPITALIZE").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_BLOCK: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_BLOCK").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_COMMENT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_COMMENT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_SLOTS: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_SLOTS").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_STATIC: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_STATIC").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_TEXT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_TEXT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def CREATE_VNODE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_VNODE").asInstanceOf[js.Symbol]
  
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
  
  @scala.inline
  def FRAGMENT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FRAGMENT").asInstanceOf[js.Symbol]
  
  type HoistTransform = js.Function3[
    /* children */ js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode], 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    /* parent */ typingsSlinky.vueCompilerCore.mod.ParentNode2, 
    scala.Unit
  ]
  
  @scala.inline
  def KEEP_ALIVE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("KEEP_ALIVE").asInstanceOf[js.Symbol]
  
  @scala.inline
  def MERGE_PROPS: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MERGE_PROPS").asInstanceOf[js.Symbol]
  
  type Namespace = scala.Double
  
  type Namespaces = typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`0`
  
  type NodeTransform = js.Function2[
    /* node */ typingsSlinky.vueCompilerCore.mod.RootNode | typingsSlinky.vueCompilerCore.mod.TemplateChildNode, 
    /* context */ typingsSlinky.vueCompilerCore.mod.TransformContext, 
    scala.Unit | js.Function0[scala.Unit] | js.Array[js.Function0[scala.Unit]]
  ]
  
  @scala.inline
  def OPEN_BLOCK: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("OPEN_BLOCK").asInstanceOf[js.Symbol]
  
  @scala.inline
  def POP_SCOPE_ID: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("POP_SCOPE_ID").asInstanceOf[js.Symbol]
  
  @scala.inline
  def PUSH_SCOPE_ID: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PUSH_SCOPE_ID").asInstanceOf[js.Symbol]
  
  @scala.inline
  def RENDER_LIST: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RENDER_LIST").asInstanceOf[js.Symbol]
  
  @scala.inline
  def RENDER_SLOT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RENDER_SLOT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def RESOLVE_COMPONENT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_COMPONENT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def RESOLVE_DIRECTIVE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_DIRECTIVE").asInstanceOf[js.Symbol]
  
  @scala.inline
  def RESOLVE_DYNAMIC_COMPONENT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_DYNAMIC_COMPONENT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def SET_BLOCK_TRACKING: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SET_BLOCK_TRACKING").asInstanceOf[js.Symbol]
  
  @scala.inline
  def SUSPENSE: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SUSPENSE").asInstanceOf[js.Symbol]
  
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
  
  @scala.inline
  def TELEPORT: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TELEPORT").asInstanceOf[js.Symbol]
  
  @scala.inline
  def TO_DISPLAY_STRING: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TO_DISPLAY_STRING").asInstanceOf[js.Symbol]
  
  @scala.inline
  def TO_HANDLERS: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TO_HANDLERS").asInstanceOf[js.Symbol]
  
  @scala.inline
  def TO_HANDLER_KEY: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TO_HANDLER_KEY").asInstanceOf[js.Symbol]
  
  type TransformPreset = js.Tuple2[
    js.Array[typingsSlinky.vueCompilerCore.mod.NodeTransform], 
    typingsSlinky.std.Record[java.lang.String, typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  ]
  
  @scala.inline
  def WITH_CTX: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("WITH_CTX").asInstanceOf[js.Symbol]
  
  @scala.inline
  def WITH_DIRECTIVES: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("WITH_DIRECTIVES").asInstanceOf[js.Symbol]
  
  @scala.inline
  def WITH_SCOPE_ID: js.Symbol = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("WITH_SCOPE_ID").asInstanceOf[js.Symbol]
  
  @scala.inline
  def advancePositionWithClone(pos: typingsSlinky.vueCompilerCore.mod.Position2, source: java.lang.String): typingsSlinky.vueCompilerCore.mod.Position2 = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithClone")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Position2]
  @scala.inline
  def advancePositionWithClone(
    pos: typingsSlinky.vueCompilerCore.mod.Position2,
    source: java.lang.String,
    numberOfCharacters: scala.Double
  ): typingsSlinky.vueCompilerCore.mod.Position2 = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithClone")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any], numberOfCharacters.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Position2]
  
  @scala.inline
  def advancePositionWithMutation(pos: typingsSlinky.vueCompilerCore.mod.Position2, source: java.lang.String): typingsSlinky.vueCompilerCore.mod.Position2 = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithMutation")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Position2]
  @scala.inline
  def advancePositionWithMutation(
    pos: typingsSlinky.vueCompilerCore.mod.Position2,
    source: java.lang.String,
    numberOfCharacters: scala.Double
  ): typingsSlinky.vueCompilerCore.mod.Position2 = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithMutation")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any], numberOfCharacters.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Position2]
  
  @scala.inline
  def assert(condition: scala.Boolean): scala.Unit = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def assert(condition: scala.Boolean, msg: java.lang.String): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def baseCompile(template: java.lang.String): typingsSlinky.vueCompilerCore.mod.CodegenResult = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  @scala.inline
  def baseCompile(template: java.lang.String, options: typingsSlinky.vueCompilerCore.mod.CompilerOptions): typingsSlinky.vueCompilerCore.mod.CodegenResult = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  @scala.inline
  def baseCompile(template: typingsSlinky.vueCompilerCore.mod.RootNode): typingsSlinky.vueCompilerCore.mod.CodegenResult = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  @scala.inline
  def baseCompile(
    template: typingsSlinky.vueCompilerCore.mod.RootNode,
    options: typingsSlinky.vueCompilerCore.mod.CompilerOptions
  ): typingsSlinky.vueCompilerCore.mod.CodegenResult = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  
  @scala.inline
  def baseParse(content: java.lang.String): typingsSlinky.vueCompilerCore.mod.RootNode = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseParse")(content.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.RootNode]
  @scala.inline
  def baseParse(content: java.lang.String, options: typingsSlinky.vueCompilerCore.mod.ParserOptions): typingsSlinky.vueCompilerCore.mod.RootNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("baseParse")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.RootNode]
  
  @scala.inline
  def buildProps(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): typingsSlinky.vueCompilerCore.anon.Directives = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.Directives]
  @scala.inline
  def buildProps(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    props: js.UndefOr[scala.Nothing],
    ssr: scala.Boolean
  ): typingsSlinky.vueCompilerCore.anon.Directives = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.Directives]
  @scala.inline
  def buildProps(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    props: js.Array[
      typingsSlinky.vueCompilerCore.mod.AttributeNode | typingsSlinky.vueCompilerCore.mod.DirectiveNode
    ]
  ): typingsSlinky.vueCompilerCore.anon.Directives = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.Directives]
  @scala.inline
  def buildProps(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    props: js.Array[
      typingsSlinky.vueCompilerCore.mod.AttributeNode | typingsSlinky.vueCompilerCore.mod.DirectiveNode
    ],
    ssr: scala.Boolean
  ): typingsSlinky.vueCompilerCore.anon.Directives = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.Directives]
  
  @scala.inline
  def buildSlots(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): typingsSlinky.vueCompilerCore.anon.HasDynamicSlots = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildSlots")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.HasDynamicSlots]
  @scala.inline
  def buildSlots(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    buildSlotFn: typingsSlinky.vueCompilerCore.mod.SlotFnBuilder
  ): typingsSlinky.vueCompilerCore.anon.HasDynamicSlots = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildSlots")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], buildSlotFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.anon.HasDynamicSlots]
  
  @scala.inline
  def createArrayExpression(elements: js.Array[java.lang.String | typingsSlinky.vueCompilerCore.mod.JSChildNode]): typingsSlinky.vueCompilerCore.mod.ArrayExpression = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ArrayExpression]
  @scala.inline
  def createArrayExpression(
    elements: js.Array[java.lang.String | typingsSlinky.vueCompilerCore.mod.JSChildNode],
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.ArrayExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ArrayExpression]
  
  @scala.inline
  def createAssignmentExpression(
    left: typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode,
    right: typingsSlinky.vueCompilerCore.mod.JSChildNode
  ): typingsSlinky.vueCompilerCore.mod.AssignmentExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAssignmentExpression")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.AssignmentExpression]
  
  @scala.inline
  def createBlockStatement(
    body: js.Array[
      typingsSlinky.vueCompilerCore.mod.JSChildNode | typingsSlinky.vueCompilerCore.mod.IfStatement
    ]
  ): typingsSlinky.vueCompilerCore.mod.BlockStatement = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlockStatement")(body.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.BlockStatement]
  
  @scala.inline
  def createCacheExpression(index: scala.Double, value: typingsSlinky.vueCompilerCore.mod.JSChildNode): typingsSlinky.vueCompilerCore.mod.CacheExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CacheExpression]
  @scala.inline
  def createCacheExpression(index: scala.Double, value: typingsSlinky.vueCompilerCore.mod.JSChildNode, isVNode: scala.Boolean): typingsSlinky.vueCompilerCore.mod.CacheExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any], isVNode.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CacheExpression]
  
  @scala.inline
  def createCallExpression[T /* <: java.lang.String | js.Symbol */](callee: T): typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T] = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T]]
  @scala.inline
  def createCallExpression[T /* <: java.lang.String | js.Symbol */](callee: T, args: js.UndefOr[scala.Nothing], loc: typingsSlinky.vueCompilerCore.mod.SourceLocation): typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T]]
  @scala.inline
  def createCallExpression[T /* <: java.lang.String | js.Symbol */](
    callee: T,
    args: js.Array[
      java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.JSChildNode | typingsSlinky.vueCompilerCore.mod.SSRCodegenNode | typingsSlinky.vueCompilerCore.mod.TemplateChildNode | js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode]
    ]
  ): typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T]]
  @scala.inline
  def createCallExpression[T /* <: java.lang.String | js.Symbol */](
    callee: T,
    args: js.Array[
      java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.JSChildNode | typingsSlinky.vueCompilerCore.mod.SSRCodegenNode | typingsSlinky.vueCompilerCore.mod.TemplateChildNode | js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode]
    ],
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InferCodegenNodeType[T]]
  
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](code: T): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: js.UndefOr[scala.Nothing],
    additionalMessage: java.lang.String
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: org.scalablytyped.runtime.NumberDictionary[java.lang.String],
    additionalMessage: java.lang.String
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](code: T, loc: typingsSlinky.vueCompilerCore.mod.SourceLocation): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation,
    messages: js.UndefOr[scala.Nothing],
    additionalMessage: java.lang.String
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation,
    messages: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  @scala.inline
  def createCompilerError[T /* <: scala.Double */](
    code: T,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation,
    messages: org.scalablytyped.runtime.NumberDictionary[java.lang.String],
    additionalMessage: java.lang.String
  ): typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompilerError | typingsSlinky.vueCompilerCore.mod.CoreCompilerError]
  
  @scala.inline
  def createCompoundExpression(
    children: js.Array[
      typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode | typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode | typingsSlinky.vueCompilerCore.mod.InterpolationNode | typingsSlinky.vueCompilerCore.mod.TextNode | java.lang.String | js.Symbol
    ]
  ): typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompoundExpression")(children.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode]
  @scala.inline
  def createCompoundExpression(
    children: js.Array[
      typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode | typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode | typingsSlinky.vueCompilerCore.mod.InterpolationNode | typingsSlinky.vueCompilerCore.mod.TextNode | java.lang.String | js.Symbol
    ],
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCompoundExpression")(children.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CompoundExpressionNode]
  
  @scala.inline
  def createConditionalExpression(
    test: typingsSlinky.vueCompilerCore.mod.JSChildNode,
    consequent: typingsSlinky.vueCompilerCore.mod.JSChildNode,
    alternate: typingsSlinky.vueCompilerCore.mod.JSChildNode
  ): typingsSlinky.vueCompilerCore.mod.ConditionalExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConditionalExpression")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ConditionalExpression]
  @scala.inline
  def createConditionalExpression(
    test: typingsSlinky.vueCompilerCore.mod.JSChildNode,
    consequent: typingsSlinky.vueCompilerCore.mod.JSChildNode,
    alternate: typingsSlinky.vueCompilerCore.mod.JSChildNode,
    newline: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.ConditionalExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConditionalExpression")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any], newline.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ConditionalExpression]
  
  @scala.inline
  def createForLoopParams(hasValueKeyIndex: typingsSlinky.vueCompilerCore.mod.ForParseResult): js.Array[typingsSlinky.vueCompilerCore.mod.ExpressionNode] = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createForLoopParams")(hasValueKeyIndex.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.vueCompilerCore.mod.ExpressionNode]]
  
  @scala.inline
  def createFunctionExpression(
    params: js.UndefOr[
      typingsSlinky.vueCompilerCore.mod.ExpressionNode | java.lang.String | (js.Array[typingsSlinky.vueCompilerCore.mod.ExpressionNode | java.lang.String])
    ],
    returns: js.UndefOr[
      typingsSlinky.vueCompilerCore.mod.TemplateChildNode | js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode] | typingsSlinky.vueCompilerCore.mod.JSChildNode
    ],
    newline: js.UndefOr[scala.Boolean],
    isSlot: js.UndefOr[scala.Boolean],
    loc: js.UndefOr[typingsSlinky.vueCompilerCore.mod.SourceLocation]
  ): typingsSlinky.vueCompilerCore.mod.FunctionExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionExpression")(params.asInstanceOf[js.Any], returns.asInstanceOf[js.Any], newline.asInstanceOf[js.Any], isSlot.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.FunctionExpression]
  
  @scala.inline
  def createIfStatement(
    test: typingsSlinky.vueCompilerCore.mod.ExpressionNode,
    consequent: typingsSlinky.vueCompilerCore.mod.BlockStatement
  ): typingsSlinky.vueCompilerCore.mod.IfStatement = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.IfStatement]
  @scala.inline
  def createIfStatement(
    test: typingsSlinky.vueCompilerCore.mod.ExpressionNode,
    consequent: typingsSlinky.vueCompilerCore.mod.BlockStatement,
    alternate: js.UndefOr[
      typingsSlinky.vueCompilerCore.mod.IfStatement | typingsSlinky.vueCompilerCore.mod.BlockStatement | typingsSlinky.vueCompilerCore.mod.ReturnStatement
    ]
  ): typingsSlinky.vueCompilerCore.mod.IfStatement = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.IfStatement]
  
  @scala.inline
  def createInterpolation(content: java.lang.String, loc: typingsSlinky.vueCompilerCore.mod.SourceLocation): typingsSlinky.vueCompilerCore.mod.InterpolationNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInterpolation")(content.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InterpolationNode]
  @scala.inline
  def createInterpolation(
    content: typingsSlinky.vueCompilerCore.mod.ExpressionNode,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.InterpolationNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createInterpolation")(content.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.InterpolationNode]
  
  @scala.inline
  def createObjectExpression(properties: js.Array[typingsSlinky.vueCompilerCore.mod.Property]): typingsSlinky.vueCompilerCore.mod.ObjectExpression = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectExpression")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ObjectExpression]
  @scala.inline
  def createObjectExpression(
    properties: js.Array[typingsSlinky.vueCompilerCore.mod.Property],
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.ObjectExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectExpression")(properties.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ObjectExpression]
  
  @scala.inline
  def createObjectProperty(key: java.lang.String, value: typingsSlinky.vueCompilerCore.mod.JSChildNode): typingsSlinky.vueCompilerCore.mod.Property = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Property]
  @scala.inline
  def createObjectProperty(
    key: typingsSlinky.vueCompilerCore.mod.ExpressionNode,
    value: typingsSlinky.vueCompilerCore.mod.JSChildNode
  ): typingsSlinky.vueCompilerCore.mod.Property = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjectProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.Property]
  
  @scala.inline
  def createReturnStatement(returns: js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode]): typingsSlinky.vueCompilerCore.mod.ReturnStatement = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ReturnStatement]
  @scala.inline
  def createReturnStatement(returns: typingsSlinky.vueCompilerCore.mod.JSChildNode): typingsSlinky.vueCompilerCore.mod.ReturnStatement = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ReturnStatement]
  @scala.inline
  def createReturnStatement(returns: typingsSlinky.vueCompilerCore.mod.TemplateChildNode): typingsSlinky.vueCompilerCore.mod.ReturnStatement = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ReturnStatement]
  
  @scala.inline
  def createRoot(children: js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode]): typingsSlinky.vueCompilerCore.mod.RootNode = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(children.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.RootNode]
  @scala.inline
  def createRoot(
    children: js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode],
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.RootNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(children.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.RootNode]
  
  @scala.inline
  def createSequenceExpression(expressions: js.Array[typingsSlinky.vueCompilerCore.mod.JSChildNode]): typingsSlinky.vueCompilerCore.mod.SequenceExpression = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSequenceExpression")(expressions.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SequenceExpression]
  
  @scala.inline
  def createSimpleExpression(content: java.lang.String, isStatic: scala.Boolean): typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode]
  @scala.inline
  def createSimpleExpression(
    content: java.lang.String,
    isStatic: scala.Boolean,
    loc: js.UndefOr[scala.Nothing],
    isConstant: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], isConstant.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode]
  @scala.inline
  def createSimpleExpression(
    content: java.lang.String,
    isStatic: scala.Boolean,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation
  ): typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode]
  @scala.inline
  def createSimpleExpression(
    content: java.lang.String,
    isStatic: scala.Boolean,
    loc: typingsSlinky.vueCompilerCore.mod.SourceLocation,
    isConstant: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], isConstant.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode]
  
  @scala.inline
  def createStructuralDirectiveTransform(name: java.lang.String, fn: typingsSlinky.vueCompilerCore.mod.StructuralDirectiveTransform): typingsSlinky.vueCompilerCore.mod.NodeTransform = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStructuralDirectiveTransform")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  @scala.inline
  def createStructuralDirectiveTransform(name: js.RegExp, fn: typingsSlinky.vueCompilerCore.mod.StructuralDirectiveTransform): typingsSlinky.vueCompilerCore.mod.NodeTransform = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStructuralDirectiveTransform")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  
  @scala.inline
  def createTemplateLiteral(elements: js.Array[java.lang.String | typingsSlinky.vueCompilerCore.mod.JSChildNode]): typingsSlinky.vueCompilerCore.mod.TemplateLiteral = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateLiteral")(elements.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.TemplateLiteral]
  
  @scala.inline
  def createTransformContext(
    root: typingsSlinky.vueCompilerCore.mod.RootNode,
    hasPrefixIdentifiersHoistStaticCacheHandlersNodeTransformsDirectiveTransformsTransformHoistIsBuiltInComponentIsCustomElementExpressionPluginsScopeIdSsrSsrCssVarsBindingMetadataOnError: typingsSlinky.vueCompilerCore.mod.TransformOptions
  ): typingsSlinky.vueCompilerCore.mod.TransformContext = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTransformContext")(root.asInstanceOf[js.Any], hasPrefixIdentifiersHoistStaticCacheHandlersNodeTransformsDirectiveTransformsTransformHoistIsBuiltInComponentIsCustomElementExpressionPluginsScopeIdSsrSsrCssVarsBindingMetadataOnError.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.TransformContext]
  
  @scala.inline
  def createVNodeCall(
    context: typingsSlinky.vueCompilerCore.mod.TransformContext | scala.Null,
    tag: java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.CallExpression,
    props: js.UndefOr[typingsSlinky.vueCompilerCore.mod.PropsExpression],
    children: js.UndefOr[
      js.Array[typingsSlinky.vueCompilerCore.mod.TemplateChildNode] | typingsSlinky.vueCompilerCore.mod.TemplateTextChildNode | typingsSlinky.vueCompilerCore.mod.SlotsExpression | typingsSlinky.vueCompilerCore.mod.ForRenderListExpression
    ],
    patchFlag: js.UndefOr[java.lang.String],
    dynamicProps: js.UndefOr[java.lang.String],
    directives: js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveArguments],
    isBlock: js.UndefOr[scala.Boolean],
    disableTracking: js.UndefOr[scala.Boolean],
    loc: js.UndefOr[typingsSlinky.vueCompilerCore.mod.SourceLocation]
  ): typingsSlinky.vueCompilerCore.mod.VNodeCall = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createVNodeCall")(context.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], isBlock.asInstanceOf[js.Any], disableTracking.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.VNodeCall]
  
  @scala.inline
  def findDir(node: typingsSlinky.vueCompilerCore.mod.ElementNode, name: java.lang.String): js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode]]
  @scala.inline
  def findDir(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    name: java.lang.String,
    allowEmpty: scala.Boolean
  ): js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode]]
  @scala.inline
  def findDir(node: typingsSlinky.vueCompilerCore.mod.ElementNode, name: js.RegExp): js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode]]
  @scala.inline
  def findDir(node: typingsSlinky.vueCompilerCore.mod.ElementNode, name: js.RegExp, allowEmpty: scala.Boolean): js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.vueCompilerCore.mod.DirectiveNode]]
  
  @scala.inline
  def findProp(node: typingsSlinky.vueCompilerCore.mod.ElementNode, name: java.lang.String): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  @scala.inline
  def findProp(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    name: java.lang.String,
    dynamicOnly: js.UndefOr[scala.Nothing],
    allowEmpty: scala.Boolean
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  @scala.inline
  def findProp(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    name: java.lang.String,
    dynamicOnly: scala.Boolean
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  @scala.inline
  def findProp(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    name: java.lang.String,
    dynamicOnly: scala.Boolean,
    allowEmpty: scala.Boolean
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  
  @scala.inline
  def generate(ast: typingsSlinky.vueCompilerCore.mod.RootNode): typingsSlinky.vueCompilerCore.mod.CodegenResult = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  @scala.inline
  def generate(
    ast: typingsSlinky.vueCompilerCore.mod.RootNode,
    options: typingsSlinky.vueCompilerCore.anon.CodegenOptionsonContextCr
  ): typingsSlinky.vueCompilerCore.mod.CodegenResult = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.CodegenResult]
  
  @scala.inline
  def generateCodeFrame(source: java.lang.String): java.lang.String = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: js.UndefOr[scala.Nothing], end: scala.Double): java.lang.String = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: scala.Double): java.lang.String = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getBaseTransformPreset(): typingsSlinky.vueCompilerCore.mod.TransformPreset = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTransformPreset")().asInstanceOf[typingsSlinky.vueCompilerCore.mod.TransformPreset]
  @scala.inline
  def getBaseTransformPreset(prefixIdentifiers: scala.Boolean): typingsSlinky.vueCompilerCore.mod.TransformPreset = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTransformPreset")(prefixIdentifiers.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerCore.mod.TransformPreset]
  
  @scala.inline
  def getInnerRange(loc: typingsSlinky.vueCompilerCore.mod.SourceLocation, offset: scala.Double): typingsSlinky.vueCompilerCore.mod.SourceLocation = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getInnerRange")(loc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SourceLocation]
  @scala.inline
  def getInnerRange(loc: typingsSlinky.vueCompilerCore.mod.SourceLocation, offset: scala.Double, length: scala.Double): typingsSlinky.vueCompilerCore.mod.SourceLocation = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getInnerRange")(loc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SourceLocation]
  
  @scala.inline
  def hasDynamicKeyVBind(node: typingsSlinky.vueCompilerCore.mod.ElementNode): scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasDynamicKeyVBind")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasScopeRef(
    node: js.UndefOr[scala.Nothing],
    ids: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  ): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasScopeRef(
    node: typingsSlinky.vueCompilerCore.mod.ExpressionNode,
    ids: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  ): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasScopeRef(
    node: typingsSlinky.vueCompilerCore.mod.IfBranchNode,
    ids: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  ): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasScopeRef(
    node: typingsSlinky.vueCompilerCore.mod.TemplateChildNode,
    ids: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  ): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def helperNameMap: js.Any = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("helperNameMap").asInstanceOf[js.Any]
  
  @scala.inline
  def injectProp(
    node: typingsSlinky.vueCompilerCore.mod.RenderSlotCall,
    prop: typingsSlinky.vueCompilerCore.mod.Property,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("injectProp")(node.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def injectProp(
    node: typingsSlinky.vueCompilerCore.mod.VNodeCall,
    prop: typingsSlinky.vueCompilerCore.mod.Property,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("injectProp")(node.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isBindKey(arg: js.UndefOr[scala.Nothing], name: java.lang.String): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBindKey")(arg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def isBindKey(arg: typingsSlinky.vueCompilerCore.mod.ExpressionNode, name: java.lang.String): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBindKey")(arg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBuiltInType(tag: java.lang.String, expected: java.lang.String): scala.Boolean = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")(tag.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCoreComponent(tag: java.lang.String): js.Symbol | scala.Unit = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCoreComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | scala.Unit]
  
  @scala.inline
  def isMemberExpression(path: java.lang.String): scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSimpleIdentifier(name: java.lang.String): scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSlotOutlet(node: typingsSlinky.vueCompilerCore.mod.RootNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSlotOutlet")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ scala.Boolean]
  @scala.inline
  def isSlotOutlet(node: typingsSlinky.vueCompilerCore.mod.TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSlotOutlet")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ scala.Boolean]
  
  @scala.inline
  def isStaticExp(p: typingsSlinky.vueCompilerCore.mod.JSChildNode): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStaticExp")(p.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ scala.Boolean]
  
  @scala.inline
  def isTemplateNode(node: typingsSlinky.vueCompilerCore.mod.RootNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ scala.Boolean]
  @scala.inline
  def isTemplateNode(node: typingsSlinky.vueCompilerCore.mod.TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ scala.Boolean]
  
  @scala.inline
  def isText(node: typingsSlinky.vueCompilerCore.mod.TemplateChildNode): scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isText")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isVSlot_0(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ scala.Boolean = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isVSlot")(p.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ scala.Boolean]
  
  @scala.inline
  def locStub: typingsSlinky.vueCompilerCore.mod.SourceLocation = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("locStub").asInstanceOf[typingsSlinky.vueCompilerCore.mod.SourceLocation]
  
  @scala.inline
  def noopDirectiveTransform: typingsSlinky.vueCompilerCore.mod.DirectiveTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("noopDirectiveTransform").asInstanceOf[typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  
  @scala.inline
  def processExpression(
    node: typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): typingsSlinky.vueCompilerCore.mod.ExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ExpressionNode]
  @scala.inline
  def processExpression(
    node: typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    asParams: js.UndefOr[scala.Nothing],
    asRawStatements: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.ExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ExpressionNode]
  @scala.inline
  def processExpression(
    node: typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    asParams: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.ExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ExpressionNode]
  @scala.inline
  def processExpression(
    node: typingsSlinky.vueCompilerCore.mod.SimpleExpressionNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    asParams: scala.Boolean,
    asRawStatements: scala.Boolean
  ): typingsSlinky.vueCompilerCore.mod.ExpressionNode = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.ExpressionNode]
  
  @scala.inline
  def processFor(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    dir: typingsSlinky.vueCompilerCore.mod.DirectiveNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): js.UndefOr[js.Function0[scala.Unit]] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processFor")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[scala.Unit]]]
  @scala.inline
  def processFor(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    dir: typingsSlinky.vueCompilerCore.mod.DirectiveNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    processCodegen: js.Function1[
      /* forNode */ typingsSlinky.vueCompilerCore.mod.ForNode, 
      js.UndefOr[js.Function0[scala.Unit]]
    ]
  ): js.UndefOr[js.Function0[scala.Unit]] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processFor")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any], processCodegen.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[scala.Unit]]]
  
  @scala.inline
  def processIf(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    dir: typingsSlinky.vueCompilerCore.mod.DirectiveNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): js.UndefOr[js.Function0[scala.Unit]] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processIf")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[scala.Unit]]]
  @scala.inline
  def processIf(
    node: typingsSlinky.vueCompilerCore.mod.ElementNode,
    dir: typingsSlinky.vueCompilerCore.mod.DirectiveNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    processCodegen: js.Function3[
      /* node */ typingsSlinky.vueCompilerCore.mod.IfNode, 
      /* branch */ typingsSlinky.vueCompilerCore.mod.IfBranchNode, 
      /* isRoot */ scala.Boolean, 
      js.UndefOr[js.Function0[scala.Unit]]
    ]
  ): js.UndefOr[js.Function0[scala.Unit]] = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processIf")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any], processCodegen.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[scala.Unit]]]
  
  @scala.inline
  def processSlotOutlet(
    node: typingsSlinky.vueCompilerCore.mod.SlotOutletNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): typingsSlinky.vueCompilerCore.mod.SlotOutletProcessResult = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("processSlotOutlet")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerCore.mod.SlotOutletProcessResult]
  
  @scala.inline
  def registerRuntimeHelpers(helpers: js.Any): scala.Unit = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerRuntimeHelpers")(helpers.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def resolveComponentType(
    node: typingsSlinky.vueCompilerCore.mod.ComponentNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.CallExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponentType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.CallExpression]
  @scala.inline
  def resolveComponentType(
    node: typingsSlinky.vueCompilerCore.mod.ComponentNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext,
    ssr: scala.Boolean
  ): java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.CallExpression = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponentType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Symbol | typingsSlinky.vueCompilerCore.mod.CallExpression]
  
  @scala.inline
  def toValidAssetId_component(name: java.lang.String, `type`: typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.component): java.lang.String = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toValidAssetId")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def toValidAssetId_directive(name: java.lang.String, `type`: typingsSlinky.vueCompilerCore.vueCompilerCoreStrings.directive): java.lang.String = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toValidAssetId")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def trackSlotScopes: typingsSlinky.vueCompilerCore.mod.NodeTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("trackSlotScopes").asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  
  @scala.inline
  def trackVForSlotScopes: typingsSlinky.vueCompilerCore.mod.NodeTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("trackVForSlotScopes").asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  
  @scala.inline
  def transform(
    root: typingsSlinky.vueCompilerCore.mod.RootNode,
    options: typingsSlinky.vueCompilerCore.mod.TransformOptions
  ): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def transformBind: typingsSlinky.vueCompilerCore.mod.DirectiveTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transformBind").asInstanceOf[typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  
  @scala.inline
  def transformElement: typingsSlinky.vueCompilerCore.mod.NodeTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transformElement").asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  
  @scala.inline
  def transformExpression: typingsSlinky.vueCompilerCore.mod.NodeTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transformExpression").asInstanceOf[typingsSlinky.vueCompilerCore.mod.NodeTransform]
  
  @scala.inline
  def transformModel: typingsSlinky.vueCompilerCore.mod.DirectiveTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transformModel").asInstanceOf[typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  
  @scala.inline
  def transformOn: typingsSlinky.vueCompilerCore.mod.DirectiveTransform = typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("transformOn").asInstanceOf[typingsSlinky.vueCompilerCore.mod.DirectiveTransform]
  
  @scala.inline
  def traverseNode(
    node: typingsSlinky.vueCompilerCore.mod.RootNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def traverseNode(
    node: typingsSlinky.vueCompilerCore.mod.TemplateChildNode,
    context: typingsSlinky.vueCompilerCore.mod.TransformContext
  ): scala.Unit = (typingsSlinky.vueCompilerCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
