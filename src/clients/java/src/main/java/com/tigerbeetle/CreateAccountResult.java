//////////////////////////////////////////////////////////
// This file was auto-generated by java_bindings.zig
// Do not manually modify.
//////////////////////////////////////////////////////////

package com.tigerbeetle;

public enum CreateAccountResult {

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#ok">ok</a>
     */
    Ok((int) 0),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#linked_event_failed">linked_event_failed</a>
     */
    LinkedEventFailed((int) 1),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#linked_event_chain_open">linked_event_chain_open</a>
     */
    LinkedEventChainOpen((int) 2),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#timestamp_must_be_zero">timestamp_must_be_zero</a>
     */
    TimestampMustBeZero((int) 3),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#reserved_flag">reserved_flag</a>
     */
    ReservedFlag((int) 4),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#reserved_field">reserved_field</a>
     */
    ReservedField((int) 5),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#id_must_not_be_zero">id_must_not_be_zero</a>
     */
    IdMustNotBeZero((int) 6),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#id_must_not_be_int_max">id_must_not_be_int_max</a>
     */
    IdMustNotBeIntMax((int) 7),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#flags_are_mutually_exclusive">flags_are_mutually_exclusive</a>
     */
    FlagsAreMutuallyExclusive((int) 8),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#ledger_must_not_be_zero">ledger_must_not_be_zero</a>
     */
    LedgerMustNotBeZero((int) 9),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#code_must_not_be_zero">code_must_not_be_zero</a>
     */
    CodeMustNotBeZero((int) 10),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#debits_pending_must_be_zero">debits_pending_must_be_zero</a>
     */
    DebitsPendingMustBeZero((int) 11),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#debits_posted_must_be_zero">debits_posted_must_be_zero</a>
     */
    DebitsPostedMustBeZero((int) 12),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#credits_pending_must_be_zero">credits_pending_must_be_zero</a>
     */
    CreditsPendingMustBeZero((int) 13),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#credits_posted_must_be_zero">credits_posted_must_be_zero</a>
     */
    CreditsPostedMustBeZero((int) 14),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#exists_with_different_flags">exists_with_different_flags</a>
     */
    ExistsWithDifferentFlags((int) 15),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#exists_with_different_user_data">exists_with_different_user_data</a>
     */
    ExistsWithDifferentUserData((int) 16),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#exists_with_different_ledger">exists_with_different_ledger</a>
     */
    ExistsWithDifferentLedger((int) 17),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#exists_with_different_code">exists_with_different_code</a>
     */
    ExistsWithDifferentCode((int) 18),

    /**
     * @see <a href="https://docs.tigerbeetle.com/reference/operations/create_accounts#exists">exists</a>
     */
    Exists((int) 19);

    public final int value;

    CreateAccountResult(int value) {
        this.value = value;
    }

    public static CreateAccountResult fromValue(int value) {
        var values = CreateAccountResult.values();
        if (value < 0 || value >= values.length)
            throw new IllegalArgumentException(
                    String.format("Invalid CreateAccountResult value=%d", value));

        return values[value];
    }
}

