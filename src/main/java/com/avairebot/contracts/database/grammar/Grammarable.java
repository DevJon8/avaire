package com.avairebot.contracts.database.grammar;

import com.avairebot.contracts.database.Database;
import com.avairebot.database.DatabaseManager;
import com.avairebot.database.query.QueryBuilder;
import com.avairebot.database.schema.Blueprint;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

public interface Grammarable {

    /**
     * Creates a {@link Database.QueryType#CREATE create} grammar instance with the provided settings.
     *
     * @param manager   The database manager instance.
     * @param blueprint The blueprint that should be used for generating the grammar query.
     * @param options   The options that should be parsed to the grammar generator.
     * @return The database query that was generated by the blueprint.
     */
    String create(DatabaseManager manager, Blueprint blueprint, @Nonnull Map<String, Boolean> options);

    /**
     * Creates a {@link Database.QueryType#DELETE create} grammar instance with the provided settings.
     *
     * @param manager The database manager instance.
     * @param query   The query builder that should be used for generating the delete query.
     * @param options The options that should be parsed to the grammar generator.
     * @return The database query that was generated by the blueprint.
     */
    String delete(DatabaseManager manager, QueryBuilder query, @Nullable Map<String, Boolean> options);

    /**
     * Creates a {@link Database.QueryType#INSERT create} grammar instance with the provided settings.
     *
     * @param manager The database manager instance.
     * @param query   The query builder that should be used for generating the insert query.
     * @param options The options that should be parsed to the grammar generator.
     * @return The database query that was generated by the blueprint.
     */
    String insert(DatabaseManager manager, QueryBuilder query, @Nullable Map<String, Boolean> options);

    /**
     * Creates a {@link Database.QueryType#SELECT create} grammar instance with the provided settings.
     *
     * @param manager The database manager instance.
     * @param query   The query builder that should be used for generating the select query.
     * @param options The options that should be parsed to the grammar generator.
     * @return The database query that was generated by the blueprint.
     */
    String select(DatabaseManager manager, QueryBuilder query, @Nullable Map<String, Boolean> options);

    /**
     * Creates a {@link Database.QueryType#UPDATE create} grammar instance with the provided settings.
     *
     * @param manager The database manager instance.
     * @param query   The query builder that should be used for generating the update query.
     * @param options The options that should be parsed to the grammar generator.
     * @return The database query that was generated by the blueprint.
     */
    String update(DatabaseManager manager, QueryBuilder query, @Nullable Map<String, Boolean> options);
}
