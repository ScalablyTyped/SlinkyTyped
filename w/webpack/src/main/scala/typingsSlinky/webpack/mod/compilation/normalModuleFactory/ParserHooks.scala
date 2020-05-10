package typingsSlinky.webpack.mod.compilation.normalModuleFactory

import typingsSlinky.tapable.mod.HookMap
import typingsSlinky.tapable.mod.SyncBailHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserHooks extends js.Object {
  var assigned: HookMap[_, _, _] = js.native
  var call: HookMap[_, _, _] = js.native
  var callAnyMember: HookMap[_, _, _] = js.native
  var canRename: HookMap[_, _, _] = js.native
  var evaluate: HookMap[_, _, _] = js.native
  var evaluateCallExpressionMember: HookMap[_, _, _] = js.native
  var evaluateDefinedIdentifier: HookMap[_, _, _] = js.native
  var evaluateIdentifier: HookMap[_, _, _] = js.native
  var evaluateTypeof: HookMap[_, _, _] = js.native
  var export: SyncBailHook[_, _, _, _] = js.native
  var exportDeclaration: SyncBailHook[_, _, _, _] = js.native
  var exportExpression: SyncBailHook[_, _, _, _] = js.native
  var exportImport: SyncBailHook[_, _, _, _] = js.native
  var exportImportSpecifier: SyncBailHook[_, _, _, _] = js.native
  var exportSpecifier: SyncBailHook[_, _, _, _] = js.native
  var expression: HookMap[_, _, _] = js.native
  var expressionAnyMember: HookMap[_, _, _] = js.native
  var expressionConditionalOperator: SyncBailHook[_, _, _, _] = js.native
  var expressionLogicalOperator: SyncBailHook[_, _, _, _] = js.native
  var `import`: SyncBailHook[_, _, _, _] = js.native
  var importCall: SyncBailHook[_, _, _, _] = js.native
  var importSpecifier: SyncBailHook[_, _, _, _] = js.native
  var label: HookMap[_, _, _] = js.native
  var `new`: HookMap[_, _, _] = js.native
  var program: SyncBailHook[_, _, _, _] = js.native
  var rename: HookMap[_, _, _] = js.native
  var statement: SyncBailHook[_, _, _, _] = js.native
  var statementIf: SyncBailHook[_, _, _, _] = js.native
  var typeof: HookMap[_, _, _] = js.native
  var varDeclaration: SyncBailHook[_, _, _, _] = js.native
  var varDeclarationConst: HookMap[_, _, _] = js.native
  var varDeclarationLet: HookMap[_, _, _] = js.native
  var varDeclarationVar: HookMap[_, _, _] = js.native
}

object ParserHooks {
  @scala.inline
  def apply(
    assigned: HookMap[_, _, _],
    call: HookMap[_, _, _],
    callAnyMember: HookMap[_, _, _],
    canRename: HookMap[_, _, _],
    evaluate: HookMap[_, _, _],
    evaluateCallExpressionMember: HookMap[_, _, _],
    evaluateDefinedIdentifier: HookMap[_, _, _],
    evaluateIdentifier: HookMap[_, _, _],
    evaluateTypeof: HookMap[_, _, _],
    export: SyncBailHook[_, _, _, _],
    exportDeclaration: SyncBailHook[_, _, _, _],
    exportExpression: SyncBailHook[_, _, _, _],
    exportImport: SyncBailHook[_, _, _, _],
    exportImportSpecifier: SyncBailHook[_, _, _, _],
    exportSpecifier: SyncBailHook[_, _, _, _],
    expression: HookMap[_, _, _],
    expressionAnyMember: HookMap[_, _, _],
    expressionConditionalOperator: SyncBailHook[_, _, _, _],
    expressionLogicalOperator: SyncBailHook[_, _, _, _],
    `import`: SyncBailHook[_, _, _, _],
    importCall: SyncBailHook[_, _, _, _],
    importSpecifier: SyncBailHook[_, _, _, _],
    label: HookMap[_, _, _],
    `new`: HookMap[_, _, _],
    program: SyncBailHook[_, _, _, _],
    rename: HookMap[_, _, _],
    statement: SyncBailHook[_, _, _, _],
    statementIf: SyncBailHook[_, _, _, _],
    typeof: HookMap[_, _, _],
    varDeclaration: SyncBailHook[_, _, _, _],
    varDeclarationConst: HookMap[_, _, _],
    varDeclarationLet: HookMap[_, _, _],
    varDeclarationVar: HookMap[_, _, _]
  ): ParserHooks = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], callAnyMember = callAnyMember.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], evaluateCallExpressionMember = evaluateCallExpressionMember.asInstanceOf[js.Any], evaluateDefinedIdentifier = evaluateDefinedIdentifier.asInstanceOf[js.Any], evaluateIdentifier = evaluateIdentifier.asInstanceOf[js.Any], evaluateTypeof = evaluateTypeof.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], exportDeclaration = exportDeclaration.asInstanceOf[js.Any], exportExpression = exportExpression.asInstanceOf[js.Any], exportImport = exportImport.asInstanceOf[js.Any], exportImportSpecifier = exportImportSpecifier.asInstanceOf[js.Any], exportSpecifier = exportSpecifier.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], expressionAnyMember = expressionAnyMember.asInstanceOf[js.Any], expressionConditionalOperator = expressionConditionalOperator.asInstanceOf[js.Any], expressionLogicalOperator = expressionLogicalOperator.asInstanceOf[js.Any], importCall = importCall.asInstanceOf[js.Any], importSpecifier = importSpecifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], statementIf = statementIf.asInstanceOf[js.Any], typeof = typeof.asInstanceOf[js.Any], varDeclaration = varDeclaration.asInstanceOf[js.Any], varDeclarationConst = varDeclarationConst.asInstanceOf[js.Any], varDeclarationLet = varDeclarationLet.asInstanceOf[js.Any], varDeclarationVar = varDeclarationVar.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserHooks]
  }
  @scala.inline
  implicit class ParserHooksOps[Self <: ParserHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigned(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCall(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallAnyMember(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callAnyMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRename(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluate(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluateCallExpressionMember(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateCallExpressionMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluateDefinedIdentifier(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateDefinedIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluateIdentifier(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluateTypeof(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluateTypeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExport(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDeclaration(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportExpression(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportImport(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportImportSpecifier(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportImportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportSpecifier(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionAnyMember(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionAnyMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionConditionalOperator(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionConditionalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionLogicalOperator(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressionLogicalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportCall(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportSpecifier(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatementIf(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statementIf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeof(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarDeclaration(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarDeclarationConst(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclarationConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarDeclarationLet(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclarationLet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarDeclarationVar(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varDeclarationVar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

